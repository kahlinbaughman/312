%include "asm_io.inc"

segment .data
	r0 db 0
	r84 db 84
	r85 db 85
	r169 db 169
	r170 db 170
	r254 db 254
	r255 db 255
	r339 dw 339
	r340 dw 340
	r424 dw 424
	r425 dw 425
	r509 dw 509
	r510 dw 510
	r594 dw 594
	r595 dw 595
	r679 dw 679
 	r680 dw 680
	r765 dw 765

	period db .
	backtick db `
	comma db ,
	colon db :
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
	

	mov ecx,[height]
height_loop:
	

	popa
	mov	eax, 0
	leave
	ret

