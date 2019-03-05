%include "asm_io.inc"

segment .data
	bin times 75 dd 0
	lower dd 0
	upper dd 9
	count dd 0
	luminance db "luminance ", 0
	hyphen db "-"
	colon db ": ", 0
	

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

print_loop:
	
	mov eax, luminance
	call print_string
	mov eax, [lower]
	call print_int
	mov eax, [hyphen]
	call print_char
	mov eax, [upper]
	call print_int
	mov eax, colon
	call print_string
	mov eax, [count]
	mov edx, 0
	mov ebx, 4
	mul ebx
	mov ebx, bin
	add eax, ebx
	mov eax, [eax]
	call print_int
	call print_nl
	
	mov eax, [lower]
	add eax, 10
	mov [lower], eax

	mov eax, [upper]
	add eax, 10
	mov [upper], eax

	mov eax, [count]
	inc eax
	mov [count], eax
	cmp eax, 75
	jne print_loop


	popa
	mov	eax, 0
	leave
	ret

