%include "asm_io.inc"

segment .data
	bin times 75 dd 0
segment .bss
	width resd 1 ; Holds the width of the image
	height resd 1 ; Holds the length of the image
 	wcount resd 1

segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha
	
	call read_int ; Get the max width of the image
	mov [width], eax ; Store the width
	mov [wcount], eax
	call read_int	; Get the max height of the image
	mov [height], eax ; Store the height
	
height_loop:

width_loop:


	call read_int ; get the next int
	mov ebx, eax ; move it into ebx
	call read_int ; Get the next int
	add ebx, eax ; Add the next int into previous
	call read_int ; Get next int
	add ebx, eax ; Add the next int into previous
	
	cmp ebx, 740
	jbe bin_74

	mov eax, ebx ; Move r+g+b into eax
	mov ecx, 10 ; Move 10 into ecx
	mov edx, 0 ; Set edx to 0
	div ecx ; Divide eax by ecx and store quotient into eax

	mov ecx, bin ; move the address of bin into edx
	mov edx, 0
	mov ebx, 4
	mul ebx ; multiply the quotient(index) by 4
	add ecx, eax ; add the new index (eax) to the bin address
	mov ebx, [ecx] ; Move whats at the new address into ebx
	inc ebx ; Increment it by 1
	mov [ecx], ebx ; mov the total back into edx
	
	;jmp loops
bin_74:
	mov ecx, bin ; move the address of bin into edx
	mov edx, 0
	mov ebx, 4
	mov eax, 74
	mul ebx ; multiply the quotient(index) by 4
	add ecx, eax ; add the new index (eax) to the bin address
	mov ebx, [ecx] ; Move whats at the new address into ebx
	inc ebx ; Increment it by 1
	mov [ecx], ebx ; mov the total back into edx

loops:
	mov eax, [wcount]
	dec eax
	mov [width], eax
	cmp eax, 0
	jne width_loop
	
	;mov eax, [width]
	;mov [wcount], eax

	;mov eax, [height]
	;dec eax
	;mov [height], eax
	;cmp eax, 0
	;jne height_loop

	dump_mem 2, ecx, 4
	
	popa
	mov	eax, 0
	leave
	ret

