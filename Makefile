ANTLR_JAR = /usr/local/lib/antlr-4.9.2-complete.jar
ANTLR = antlr4
ANTLR_FLAGS =  -visitor -no-listener
ANTLR_OUT_DIR = dist
GRAMMAR = YAPL

%: all

all: compile run

compile:
	@echo Generating $(GRAMMAR) Parser and Lexer...
	$(ANTLR) $(ANTLR_FLAGS) -o $(ANTLR_OUT_DIR) ./$(GRAMMAR)/$(GRAMMAR).g4
	@echo $(GRAMMAR) compiled successfully!

run:
	@echo Compile and Run Main...
	javac -cp ./$(ANTLR_OUT_DIR)/$(GRAMMAR):$(ANTLR_JAR) Main.java
	java -cp .:./$(ANTLR_OUT_DIR)/$(GRAMMAR):$(ANTLR_JAR) Main

clean:
	rm -rf ./$(ANTLR_OUT_DIR)/$(GRAMMAR)/*.class
	rm -rf ./$(ANTLR_OUT_DIR)/$(GRAMMAR)/*.java
	rm -rf ./$(ANTLR_OUT_DIR)/$(GRAMMAR)/*.tokens
	rm -rf ./$(ANTLR_OUT_DIR)/$(GRAMMAR)/*.interp
	rm -rf ./*.class


