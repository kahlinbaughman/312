%include "asm_io.inc"

segment .data
	bin times 75 dd 0
	hashtag dd "#"
	empty dd 32
	count dd 0
	hyphen db "-"
	max dd 0
	size dd 0
	rows dd 20

segment .bss
	width resd 1 ; Holds the width of the image
	height resd 1 ; Holds the length of the image

segment .text
	global asm_main

asm_main:
	enter	0,0
	pusha
	
	call read_int ; Get the max width of the image
	mov [width], eax ; Store the width
	call read_int	; Get the max height of the image
	mov [height], eax ; Store the height
	
	mov esi, [width] ; Move width into esi
	mov edi, [height] ; Mov height into edi
	
height_loop:

width_loop:


	call read_int ; get the next int
	mov ebx, eax ; move it into ebx
	call read_int ; Get the next int
	add ebx, eax ; Add the next int into previous
	call read_int ; Get next int
	add ebx, eax ; Add the next int into previous
	
	cmp ebx, 740
	jae bin_74

	mov eax, ebx ; Move r+g+b into eax
	mov ecx, 10 ; Move 10 into ecx
	mov edx, 0 ; Set edx to 0
	div ecx ; Divide eax by ecx and store quotient into eax

	mov ecx, bin ; move the address of bin into edx
	mov edx, 0 ; Set edx to 0 for multiplication
	mov ebx, 4 ; Use four for int size
	mul ebx ; multiply the quotient(index) by 4
	add ecx, eax ; add the new index (eax) to the bin address
	mov ebx, [ecx] ; Move whats at the new address into ebx
	inc ebx ; Increment it by 1
	mov [ecx], ebx ; mov the total back into ecx
	
	jmp loops
bin_74:
	mov ecx, bin ; move the address of bin into edx
	mov edx, 0
	mov ebx, 4
	mov eax, 74
	mul ebx ; multiply the quotient(index) by 4
	add ecx, eax ; add the new index (eax) to the bin address
	mov ebx, [ecx] ; Move whats at the new address into ebx
	inc ebx ; Increment it by 1
	mov [ecx], ebx ; mov the total back into ecx

loops:
	; Width Loop Logic Start (Inner loop)
	dec esi
	cmp esi, 0
	jne width_loop
	mov esi, [width]
	; Width Loop Logic end (Inner Loop)
	
	; Height Loop Logic Start (Outer)
	dec edi
	cmp edi, 0
	jne height_loop
	; Height Loop Logic end (Outer)



	; Set up for max loop 
	mov ecx, 0
max_loop:
	
	; Stores whats at the bin into eax
	mov eax, ecx
	mov edx, 0
	mov ebx, 4
	mul ebx
	mov ebx, bin
	add eax, ebx
	mov eax, [eax]
	
	; Checks the loop
	cmp ecx, 75
	je max_loop_end
	inc ecx
	
	; Switches if eax > max
	cmp eax, [max]
	ja switch
	jmp max_loop
	

switch:
	mov [max], eax
	jmp max_loop
	
	
max_loop_end:


	; Uses size to store the increments to divy up the "bins by"
	mov edx, 0
	mov eax, [max]
	mov ebx, 20
	div ebx
	mov [size], eax

	; Set up for top print
	mov ebx, 0
	mov eax, [hyphen]

top_print:	
	call print_char
	inc ebx
	cmp ebx, 75
	jne top_print
	call print_nl


print_loop:


	mov eax, [count]
	mov edx, 0
	mov ebx, 4
	mul ebx
	mov ebx, bin
	add eax, ebx
	mov eax, [eax]

	mov ebx, [size]
	div ebx
	mov ebx, [size]
	
	
	cmp eax, [rows]
	jl skip
	mov eax, [hashtag]
	call print_char
	jmp skip_space_print
		
skip:	
	mov eax, [empty]
	call print_char

skip_space_print:
	

	mov eax, [count]
	inc eax
	mov [count], eax
	cmp eax, 75
	jne print_loop
	call print_nl
	mov eax, 0
	mov [count], eax
	

	mov eax, [rows]
	cmp eax, 0
	je finish
	dec eax
	mov [rows], eax
	jne print_loop
	
finish:

	; prep  bottom print
	mov ebx, 0
	mov eax, [hyphen]

bottom_print:	
	call print_char
	inc ebx
	cmp ebx, 75
	jne bottom_print
	call print_nl

	popa
	mov	eax, 0
	leave
	ret

