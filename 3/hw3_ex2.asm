%include "asm_io.inc"

segment .data	
	exclamation db "!"					; 
	messageOut1 db "Enter a 4-character string: ", 0 	; The message telling the user what to do
	messageOut2 db "Enter a 2-character string: ", 0 	; The message print out the the output message
	messageOut3 db "The output is: ", 0
	null db 0
	
segment .bss
	input1 resd 1 		; First integer from user
	space resd 1
	input2 resd 1	 	; Second integer from user
	output resd 1
segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha
	
	mov eax, messageOut1
	call print_string	

	call read_char		;
	mov [input1], eax	; Stores first char into input1
	call read_char		; Gets second char
	mov ebx, input1		; Puts the address of input1 into ebx
	add ebx, 1		; Incress the address by one
	mov [ebx], eax		; Moves the second char into input1 after the first char

	; Reads next input into the next portion of input1
	call read_char
	add ebx, 1
	mov [ebx], eax
	
	; Same as above
	call read_char
	add ebx, 1
	mov [ebx], eax

	; Same as above
	call read_char
	add ebx, 1
	mov [ebx], eax

	; Appends null termination
	add ebx, 1
	mov eax, [null]
	mov [ebx], eax

	;Gets second input
	mov eax, messageOut2
	call print_string


	call read_char		; Gets the first char for input2
	mov [input2], eax	; Stores first char into input2
	call read_char		; Gets second char
	mov ebx, input2		; Stores the address of input2 into ebx
	add ebx, 1		; Incress the address by one
	mov [ebx], eax		; Moves the second char into input2 after the first char

	; Reads next input into the next portion of input2
	call read_char
	add ebx, 1
	mov [ebx], eax

	; Appends null termination
	add ebx, 1
	mov eax, [null]
	mov [ebx], eax

	;move last character of first input
	mov ebx, input1
	add ebx, 3
	mov eax, [ebx]
	mov [output], eax

	;move first character of second input
	mov eax, [input2]
	mov ebx, output
	add ebx, 1		; ebx is equal to output + 1
	mov [ebx], eax
	
	;mov first character of second input
	add ebx, 1		; equal to output +2
	mov [ebx], eax

	;third character of first input
	mov ecx, input1
	add ecx, 2		
	mov eax, [ecx]
	add ebx, 1		; qual to output +3
	mov [ebx], eax

	;add second character of second input
	mov ecx, input2
	add ecx, 1
	mov eax, [ecx]
	add ebx, 1		; equal to output +4
	mov [ebx], eax	

	;add exclamation
	add ebx, 1		; equal to output +5
	mov eax, [exclamation]
	mov [ebx], eax

	; Second character first string
	add ebx, 1		; equal to output +6
	mov ecx, input1
	add ecx, 1
	mov eax, [ecx]
	mov [ebx], eax

	;first character second string
	add ebx, 1 		;equal to output +7
	mov eax, [input2]
	mov [ebx], eax

	;first character second string
	add ebx, 1 		;equal to output +8
	mov eax, [input2]
	mov [ebx], eax

	;first character second string
	add ebx, 1 		;equal to output +9
	mov eax, [input2]
	mov [ebx], eax

	;first character second string
	add ebx, 1 		;equal to output +10
	mov eax, [input2]
	mov [ebx], eax

	;first character first string
	add ebx, 1
	mov eax, [input1]
	mov [ebx], eax

	;second character second string
	add ebx, 1
	mov ecx, input2
	add ecx, 1
	mov eax, [ecx]
	mov [ebx], eax

	;second character second string
	add ebx, 1
	mov [ebx], eax

	;add exclamation
	add ebx, 1	
	mov eax, [exclamation]
	mov [ebx], eax

	; Appends null termination
	add ebx, 1
	mov eax, [null]
	mov [ebx], eax

	; Prints the string
	mov eax, messageOut3
	call print_string
	mov eax, output
	call print_string
	call print_nl
	

	popa
	mov	eax, 0
	leave
	ret

