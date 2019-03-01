%include "asm_io.inc"

segment .data
	r0 dd 0
	r84 dd 84
	; Above is taken care of
	r85 dd 85
	r169 dd 169
	r170 dd 170
	r254 dd 254
	r255 dd 255
	r339 dd 339
	r340 dd 340
	r424 dd 424
	r425 dd 425
	r509 dd 509
	r510 dd 510
	r594 dd 594
	r595 dd 595
	r679 dd 679
	; Below is taken care of
 	r680 dd 680
	r765 dd 765

	period db "."
	backtick db "`"
	comma db ","
	colon db ":"
	i db "i"
	l db "l"
	w db "w"
	X db "X"
	W db "W"

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
	
	mov ecx, [width] ; Set the counter for the loop
	mov edx, [height]
height_loop:

width_loop:

	call read_int ; get the next int
	mov ebx, eax ; move it into ebx
	call read_int ; Get the next int
	add ebx, eax ; Add the next int into previous
	call read_int ; Get next int
	add ebx, eax ; Add the next int into previous
	
	mov eax, [r680]
	cmp eax, ebx ; Compare 680 and ebx
	jbe its_W 	; If ebx >= 680 its W

	cmp [r84], ebx	; Compare 84 and ebx
	jae its_period	; If ebx <= 84 its period

	cmp [r169], ebx
	jae its_backtick

	cmp [r254], ebx
	jae its_comma

	cmp [r339], ebx
	jae its_colon

	cmp [r424], ebx
	jae its_i

	cmp [r509], ebx
	jae its_l

	cmp [r594], ebx
	jae its_w

	cmp [r679], ebx
	jae its_X

its_period:
	mov eax, [period]
	call print_char
	call print_char
	jmp end

its_backtick:
	mov eax, [backtick]
	call print_char
	call print_char
	jmp end

its_comma:
	mov eax, [comma]
	call print_char
	call print_char
	jmp end

its_colon:
	mov eax, [colon]
	call print_char
	call print_char
	jmp end
its_i:
	mov eax, [i]
	call print_char
	call print_char
	jmp end

its_l:
	mov eax, [l]
	call print_char
	call print_char
	jmp end

its_w:
	mov eax, [w]
	call print_char
	call print_char
	jmp end

its_X:
	mov eax, [X]
	call print_char
	call print_char
	jmp end
its_W:
	mov eax, [W]
	call print_char
	call print_char

end:
	mov eax, 0
	dec ecx
	cmp ecx, eax
	jne width_loop

	call print_nl
	mov ecx, [width]	

	mov eax, 0
	dec edx
	cmp edx, eax
	jne height_loop

	

	popa
	mov	eax, 0
	leave
	ret

