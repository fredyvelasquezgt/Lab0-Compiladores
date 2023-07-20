import sys
from antlr4 import *
from build.yaplLexer import yaplLexer
from build.yaplParser import yaplParser
from yaplWalker import yaplWalker
from yaplErrorListener import yaplErrorListener
from rich.console import Console
from rich.tree import Tree

console = Console()

def build_tree_rich(node, rule_names):
    """
    Recursively build a rich tree representation.
    """
    if isinstance(node, str):
        return Tree(node)
    
    s = node.toStringTree(rule_names)
    parts = s.split(" ")

    root = Tree(parts[0])

    for part in parts[1:]:
        if part:
            child_tree = build_tree_rich(part, rule_names)
            root.add(child_tree)

    return root

def main(argv):
    input = FileStream(argv[1])

    lexer = yaplLexer(input)
    lexer.removeErrorListeners()
    lexer.addErrorListener(yaplErrorListener())

    stream = CommonTokenStream(lexer)
    stream.fill()

    console.print("Tokens:")
    for token in stream.tokens:
        console.print(token)

    parser = yaplParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(yaplErrorListener())

    tree = parser.prog()

    rich_tree = build_tree_rich(tree, parser.ruleNames)
    console.print(rich_tree)

    walker = yaplWalker()
    walker.initSymbolTable()
    walker.visit(tree)

if __name__ == '__main__':
    main(sys.argv)
