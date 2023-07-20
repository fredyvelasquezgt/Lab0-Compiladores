import sys
from antlr4 import *
from dist.pruebaLexer import pruebaLexer
from dist.pruebaParser import pruebaParser
from dist.pruebaVisitor import pruebaVisitor

if __name__ == "__main__":
    if len(sys.argv) > 1:
        data = FileStream(sys.argv[1])
    else:
        data = InputStream(sys.stdin.readline())

        # lexer
        lexer = pruebaLexer(data)
        stream = CommonTokenStream(lexer)
        # parser
        parser = pruebaParser(stream)
        tree = parser.expr()
        # evaluator
        visitor = pruebaVisitor()
        output = visitor.visit(tree)
        tree_string = tree.toStringTree(recog=parser)
        print(tree_string)
        print(output)

