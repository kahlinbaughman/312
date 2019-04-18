%include "asm_io.inc"

segment .data
	hex db "0123456789ABCDEF"
	inputmsg db "Enter an integer: ", 0
	hexrep times 5 db 0
	divisor dd 00Fh
	count db 0
	starting db 7

segment .bss
	input resd 1

segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha
	
	dump_mem 2, hexrep, 4
	; Ask user for input and store it into eax
	mov eax, inputmsg 
	call print_string
	call read_int
	call print_nl
	mov [input], eax
loop:
	and eax, [divisor]
	movzx ebx, al
	add ebx, hex
	movzx ecx, byte [ebx]
	dump_regs 5
	mov ebx, ecx
	mov ecx, [count]
	dump_regs 6
	shl ecx, 2
	dump_regs 7
	shl ebx, cl
	dump_regs 8
	mov ecx, [count]
	dec ecx
	mov [count], ecx
	mov eax, [hexrep]
	dump_regs 2
	or eax, ebx
	dump_regs 1
	mov [hexrep+3], eax
	
	


	mov eax, [input]
	sar eax, 4
	mov [input], eax
	cmp eax, 0
	je end
	jmp loop	
	
	
end:
	dump_mem 1, hexrep, 4
	;call print_nl
	;mov eax, hexrep
	;call print_string




















	

	popa
	mov	eax, 0
	leave
	ret

