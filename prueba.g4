grammar prueba;

/*
YAPL SYNTAX
*/
program:
    programData EOF
    ;
programData:
   (classSpecification ';')*
   | EOF
   ;
classSpecification :
    CLASS TYPE (INHERITS TYPE)? '{' (feature ';')* '}';
feature :
    (ID) '(' (formal (','formal)*)? ')' ':' TYPE '{' expr '}'
    | ID ':' TYPE ('<-' expr)?;
formal:
    ID ':' TYPE;
expr :
    ID '<-' expr
    | expr ('@' TYPE)? '.' ID '(' (expr (',' expr)*)? ')'
    | ID '(' (expr (',' expr)*)? ')'
    | IF expr THEN expr ELSE expr FI
    | WHILE expr LOOP expr POOL
    | '{' (expr ';')* '}'
    | 'let' ID ':' TYPE ('<-' expr)? (',' ID ':' TYPE ('<-' expr)?)* IN expr
    | NEW TYPE
    | ISVOID expr
    | expr '+' expr
    | expr '-' expr
    | expr '*' expr
    | expr '/' expr
    | '~' expr
    | expr '<' expr
    | expr '<=' expr
    | expr '=' expr
    | NOT expr
    | '(' expr ')'
    | ID
    | INTEGER
    | STRING
    | TRUE
    | FALSE
    ;

/*
Reserved words
*/
CLASS: C L A S S;
ELSE: E L S E;
FALSE: 'false';
FI: F I;
IF: I F;
IN: I N;
INHERITS: I N H E R I T S;
ISVOID: I S V O I D;
LOOP: L O O P;
POOL: P O O L;
THEN: T H E N;
WHILE: W H I L E;
NEW: N E W;
NOT: N O T;
TRUE: 'true';
LET: L E T;

/*
TYPES
*/
INTEGER: [0-9]+;
ID: [a-z] [_0-9A-Za-z]*;        // Object ID
TYPE: [A-Z] [_0-9A-Za-z]*;      // Type ID
SELF: 'self';
SELF_TYPE: 'SELF_TYPE';
STRING: '"' (ESC | ~ ["\\])* '"';

/*
ESC, UNICODE, HEX
*/
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];

/*
Case insensitive fragments
*/
fragment A: [aA];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment H: [hH];
fragment I: [iI];
fragment L: [lL];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];

/*
COMMENTS
*/
START_COMMENT: '(*';
END_COMMENT: '*)';
COMMENT: START_COMMENT (COMMENT | .)*? END_COMMENT -> skip;
LINE_COMMENT: '--' (~ '\n')* '\n'? -> skip;

/*
WHITESPACES
*/
WHITESPACE: [ \t\r\n\f]+ -> skip;

