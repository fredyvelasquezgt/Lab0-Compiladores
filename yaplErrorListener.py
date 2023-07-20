

from antlr4 import *
from antlr4.error.ErrorListener import *

class yaplErrorListener(ErrorListener):

    ANSI_RESET = "\u001B[0m"
    ANSI_RED = "\u001B[31m"

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print("\n" + self.ANSI_RED)
        print("----------------------------- ERROR -----------------------------")
        print("Error: position " + str(line) + ":" + str(column) + " " + msg)
        print("-----------------------------------------------------------------")
        print("\n" + self.ANSI_RESET)=
