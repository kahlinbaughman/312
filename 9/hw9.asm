%include "asm_io.inc"
segment .bss
	a  resd 1
	b  resd 1
	c  resd 1
segment .text
	global asm_main
asm_main:
	enter 0,0
	pusha
	mov eax,2
	mov [a], eax
	mov eax,3
	mov [b], eax
	mov eax,[a]
	add eax,[b]
	mov [c], eax
	mov eax, [a]
	call print_int
	call print_nl
	mov eax, 12
	call print_int
	call print_nl
	mov eax, [c]
	call print_int
	call print_nl
	mov eax, 66
	call print_int
	call print_nl
	popa
	mov eax,0
	leave
	ret
