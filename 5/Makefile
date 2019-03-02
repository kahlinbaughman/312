PROGRAM1=rgb2ascii
PROGRAM2=rgb2lumhist1
CC=gcc
CFLAGS=-m32
ASM=nasm
ASMFLAGS=-f elf

default: compile

run: $(PROGRAM)
	@./$(PROGRAM)

compile: $(PROGRAM1) $(PROGRAM2)

$(PROGRAM1): $(PROGRAM1).o driver.o asm_io.o
	$(CC) $(CFLAGS) $(PROGRAM1).o driver.o asm_io.o -o $(PROGRAM1)

$(PROGRAM1).o: $(PROGRAM1).asm
	$(ASM) $(ASMFLAGS) $(PROGRAM1).asm -o $(PROGRAM1).o

$(PROGRAM2): $(PROGRAM2).o driver.o asm_io.o
	$(CC) $(CFLAGS) $(PROGRAM2).o driver.o asm_io.o -o $(PROGRAM2)

$(PROGRAM2).o: $(PROGRAM2).asm
	$(ASM) $(ASMFLAGS) $(PROGRAM2).asm -o $(PROGRAM2).o

asm_io.o: asm_io.asm
	$(ASM) $(ASMFLAGS) -d ELF_TYPE asm_io.asm -o asm_io.o

driver.o: driver.c
	$(CC) $(CFLAGS) -c driver.c -o driver.o

clean:
	/bin/rm -f *.o $(PROGRAM1) $(PROGRAM2)

