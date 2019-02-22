%include "asm_io.inc"

segment .data	
	sixtyFiveHold dd 65 				; 
	messageIn db "Enter an integer: ",0 		; The message telling the user what to do
	messageOut db "The output character is: ", 0 	; The message print out the the output message
segment .bss
	input1 resd 1 		; First integer from user
	input2 resd 1	 	; Second integer from user
	result resd 1		; Results from addition
segment .text
	global asm_main
asm_main:
	enter	0,0
	pusha
	
	mov eax, messageIn 	; Move messageIn into EAX
	call print_string 	; Prints messageIn
	call read_int 		; Reads an int and stores it into EAX
	mov [input1], eax 	; Moves input from eax into input1
	mov eax, messageIn
	call print_string	; Prints messageIn
	call read_int		; Reads an int and stores it into EAX
	mov [input2], eax	; Moves the value into input2
	add eax, [input1]	; Adds input2, in eax, with input1
	add eax, [sixtyFiveHold]; Adds 65 to the result
	mov [result], eax	; Move result in eax to result
	mov eax, messageOut	
	call print_string	; Print out message out
	mov eax, [result]	; Moves result to eax
	call print_char		; Prints out the character equivalent
	call print_nl

	popa
	mov	eax, 0
	leave
	ret

