; This simple program simply adds to 32-bit integers together
; and stores the results bac in memory

%include "asm_io.inc"

segment .data	
	L	dd	123

segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha	


	
	mov	ebx, L
here:
	not	al
there:
	mov	eax, there
	sub	eax, here
	call	print_int
	call	print_nl




	leave
	ret

