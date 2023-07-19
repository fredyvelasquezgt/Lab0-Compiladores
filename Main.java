import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static class MyErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(
                Recognizer<?,?> recognizer,
                Object offendingSymbol,
                int line,
                int charPositionInLine,
                String msg,
                RecognitionException e)
        {
            System.err.println("Bad token at line: " + line + ":" + charPositionInLine);
            System.out.println("--> " + msg);
            System.exit(1);
        }
    }

    public static final String TEST_FOLDER = "./input/";
    public static final String OUTPUT_FOLDER = "./output/";
    public static final String TEST_EXTENSION = ".cl";
    static ANTLRErrorListener lexerErrorListener = new MyErrorListener();
    static ANTLRErrorListener parserErrorListener = new MyErrorListener();

    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        System.out.print("\n\nEnter test file name (just name, without extension/path): ");
        String inputFile = TEST_FOLDER + read.next() + TEST_EXTENSION;
        String outputFileName = inputFile.substring(
                TEST_FOLDER.length(), inputFile.lastIndexOf('.')
        );
        System.out.println("\n");

        CharStream input = CharStreams.fromFileName(inputFile);
        YAPLLexer lexer = new YAPLLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrorListener);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        // Fill tokens
        tokenStream.fill();
        List<Token> allTokens = tokenStream.getTokens();

        Boolean err = false ;
        for (int i = 0 ; i < allTokens.size() ; i++){
            if (allTokens.get(i).getType() == YAPLLexer.ERROR) {
                err = true ;
                System.out.println("Error in line: " +
                    allTokens.get(i).getLine() +
                    ":" + allTokens.get(i).getCharPositionInLine() +
                    "\n"
                );
            }
        }

        if (!err) {
            YAPLParser parser = new YAPLParser(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(lexerErrorListener);
            
            ParseTree tree = parser.program();

            // Parse Tree to TXT
            String treeoutput = tree.toStringTree(parser);
            PrintWriter writer = new PrintWriter(OUTPUT_FOLDER + outputFileName + ".tree.txt", "UTF-8");
            writer.println(treeoutput);
            writer.close();

            // If everything is OK, display Parse Tree
            TestRig.main(new String[]{"YAPL" ,"program", "-gui", "-tokens", inputFile});
        }
    }
}
    
