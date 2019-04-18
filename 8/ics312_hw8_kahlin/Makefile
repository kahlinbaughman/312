PROGRAM=hw8_main_program
FUNCTIONS=hw8_functions
CC=gcc
CFLAGS=-m32
ASM=nasm
ASMFLAGS=-f elf

default: $(PROGRAM) 


run: $(PROGRAM)
	@./$(PROGRAM)

$(PROGRAM): $(PROGRAM).o $(FUNCTIONS).o driver.o asm_io.o
	$(CC) $(CFLAGS) $(PROGRAM).o $(FUNCTIONS).o driver.o asm_io.o -o $(PROGRAM)

$(PROGRAM).o: $(PROGRAM).asm
	$(ASM) $(ASMFLAGS) $(PROGRAM).asm -o $(PROGRAM).o

$(FUNCTIONS).o: $(FUNCTIONS).asm
	$(ASM) $(ASMFLAGS) $(FUNCTIONS).asm -o $(FUNCTIONS).o

asm_io.o: asm_io.asm
	$(ASM) $(ASMFLAGS) -d ELF_TYPE asm_io.asm -o asm_io.o

driver.o: driver.c
	$(CC) $(CFLAGS) -c driver.c -o driver.o

clean:
	/bin/rm -f *.o $(PROGRAM)

