lexer grammar Lex;

@members {
    /*
    YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
    */

    public static int linenum = 0;
    public static boolean inComment = false;
    public static boolean inString = false;
    public static boolean initial = true;
    public static int nesting = 0;
}


NEWLINE: '\r'? '\n' { linenum++; System.out.println("Line: " + linenum); } -> skip;
WS:  [ \t\f\r\n]+ -> skip;

LINECOMMENT: '--' (~ '\n')* '\n' { linenum++; System.out.println("Line: " + linenum); } -> skip;
LINECOMMENTEOF: '--' (~ '\n')* EOF { System.out.println("Line: " + linenum); } -> skip;

BEGINCOMMENT: '(*' {initial}? { inComment = true; initial = false; nesting++; System.out.println("Start comment");} -> skip ;

// About the nestable comments

BEGINCOMMENTNEST: '(*' {inComment}? { nesting++; } -> skip;
ENDCOMMENT:  '*)' {inComment}?
      { nesting--;
        if (nesting == 0) {
          inComment = false; initial = true; System.out.println("End comment");
        }
      } -> skip;
IGNOREINCOMMENT: ~[*(\n]+  {inComment}?  { System.out.println("Discarding chars: " + getText()); } -> skip;
IGNOREINCOMMENTLPAREN : '(' { inComment}?  { System.out.println("Discarding lparen"); }  -> skip;
IGNOREINCOMMENTSTAR : '*' { inComment}?  { System.out.println("Discarding star"); }  -> skip;
IGNOREINCOMMENTNEWLINE: '\n' {inComment}?  { linenum++; System.out.println("Line: " + linenum); } -> skip;

BADENDCOMMENT:  '*)' {initial}?  { System.out.println("Bad end comment"); if (true) { throw new RuntimeException("Bad end "); } };

TRUE: [t][rR][uU][eE];
FALSE: [f][aA][lL][sS][eE];

CLASS: [cC][lL][aA][sS][sS];
FI: [fF][iI];
IF: [iI][fF];
IN: [iI][nN];
INHERITS: [iI][nN][hH][eE][rR][iI][tT][sS];
ISVOID: [iI][sS][vV][oO][iI][dD];
LET: [lL][eE][tT];
LOOP: [lL][oO][oO][pP];
POOL: [pP][oO][oO][lL];
THEN: [tT][hH][eE][nN];
ELSE: [eE][lL][sS][eE];
WHILE: [wW][hH][iI][lL][eE];
CASE: [cC][aA][sS][eE];
ESAC: [eE][sS][aA][cC];
NEW: [nN][eE][wW];
OF: [oO][fF];
NOT: [nN][oO][tT];

TYPE: [A-Z][_A-Za-z0-9]*;
ID:  [a-z][_A-Za-z0-9]*;
INT_CONST: [0-9][0-9]*;

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI: ';';
COLON: ':';
ASSIGN: '<-';
DARROW: '=>';
NEG: '~';
COMMA: ',';
PERIOD: '.';
AT: '@';
MUL: '*';
ADD: '+';
MINUS: '-';
DIV: '/';
LT: '<';
LEQ: '<=';
EQ: '=';
ERROR: . ;


fragment
ESC: '\\"' | '\\\\' ;

STR_CONST:   '"' ( ESC | .)*? '"' {
    String text = getText();    
    //write your code to test strings here
    
    StringBuilder str = new StringBuilder(0);
    int len = text.length();
    int len_count = 0;
    /* boolean flags each for one kind of error */
    boolean nullflag = false;
    boolean esc_nullflag = false;
    boolean unescaped = false;
    boolean eof = false;
    boolean toolong = false;
    boolean backslash = false;
    /* check for eof, unescaped, backslash errors but don't report yet */
    if ((text.charAt(len - 1) != '\"' && text.charAt(len - 1) != '\n' && text.charAt(len - 1) != '\\') || len == 1)
        eof = true;
    else if (text.charAt(len - 1) == '\n') 
        unescaped = true;
    /* assume the last backslash is unescaped */
    else if (text.charAt(len - 1) == '\\')
        backslash = true;
    /* process special escaped characters, and make semantically equivalent string */
    for (int i = 1; i < len - 1; ) {
        if (text.charAt(i) == '\\') {
            if (i + 1 < len && text.charAt(i+1) == 'n')
                str.append('\n');
            else if (i + 1 < len && text.charAt(i+1) == 't')
                str.append('\t');
            else if (i + 1 < len && text.charAt(i+1) == 'f')
                str.append('\f');
            else if (i + 1 < len && text.charAt(i+1) == 'b')
                str.append('\b');
            else if (i + 1 < len && text.charAt(i+1) == '\"'){
                str.append('\"');
                if (i == len - 2) {
                    eof = true;
                }
            }
            else if (i + 1 < len && text.charAt(i+1) == '\\'){
                str.append('\\');
                /* last backslash is not unescaped */
                if (i == len - 2) {
                    eof = true;
                    backslash = false;
                }
            }
            else if (i + 1 < len && text.charAt(i+1) == '\n'){
                str.append('\n');
                if (i == len - 2) {
                    eof = true;
                    unescaped = false;
                }
            }
            else if (i + 1 < len && text.charAt(i+1) == '\u0000' && nullflag == false){
                esc_nullflag = true;
                break;
            }
            else if (i + 1 < len)
                str.append(text.charAt(i+1));
            i += 2;
        }
        else if (text.charAt(i) == '\u0000' && esc_nullflag == false){
            nullflag = true;
            break;
        }
        else {
            str.append(text.charAt(i));
            i++;
        }
        len_count += 1;
        if (len_count > 1024)
            toolong = true;
    }

    /* reporting errors according to the preference */
    if (nullflag) {
        setText("String contains null character.");
        setType(ERROR);
        return;
    }
    if (esc_nullflag) {
        setText("String contains escaped null character.");
        setType(ERROR);
        return;
    }
    if (backslash && len_count < 1026) {
        setText("Backslash at end of file");
        setType(ERROR);
        return;
    }
    if (unescaped && len_count < 1026)  {
        setText("Unterminated string constant");
        setType(ERROR);
        return;
    }
    if (toolong) {
        setText("String constant too long");
        setType(ERROR);
        return;
    }
    if (eof) {
        setText("EOF in string constant");
        setType(ERROR);
        return;
    }

    String fstr = str.toString();
    setText(fstr);
};
