PROGRAM=hw9
CC=gcc
CFLAGS=-m32
ASM=nasm
ASMFLAGS=-f elf

default: $(PROGRAM)


run: $(PROGRAM)
	@./$(PROGRAM)

$(PROGRAM): $(PROGRAM).o  driver.o asm_io.o
	$(CC) $(CFLAGS) $(PROGRAM).o driver.o asm_io.o -o $(PROGRAM)

$(PROGRAM).o: $(PROGRAM).asm
	$(ASM) $(ASMFLAGS) $(PROGRAM).asm -o $(PROGRAM).o

asm_io.o: asm_io.asm
	$(ASM) $(ASMFLAGS) -d ELF_TYPE asm_io.asm -o asm_io.o

driver.o: driver.c
	$(CC) $(CFLAGS) -c driver.c -o driver.o
antlr: 
	java -jar ./antlr-4.7.1-complete.jar MyLanguageV1Code.g4
	javac -cp .:./antlr-4.7.1-complete.jar MyLanguageV1Code*.java
	java  -cp .:./antlr-4.7.1-complete.jar org.antlr.v4.runtime.misc.TestRig MyLanguageV1Code program sourcecode.txt > hw9.asm

clean:
	/bin/rm -f *.o $(PROGRAM)
	/bin/rm -f *.java *.class *.tokens *.interp
