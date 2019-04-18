%include "asm_io.inc"

extern getInputArray
extern findFirstIndex
extern findAllIndices

segment .data
	msg1	db	"The ",0
	msg2	db	" entered values are: ",0
	msg3	db	"The index of the 1st power of two element is: ",0
	msg4	db	"The index of the 1st multiple of 7 element is: ",0
	msg5	db	" of the elements are powers of 2",0
	msg6	db	"The powers of 2 are at indices: ",0
	msg7	db	" of the elements are multiples of 7",0
	msg8	db	"The multiples of 7 are at indices: ",0

segment .bss
        num_elements       		resd 1	; number of elements in the input array
        array_address      		resd 1	; address of the input array
	num_powers_of_two		resd 1	; number of elements that are powers of 2
	array_of_powers_of_two		resd 1	; address of the powers of 2 array
	num_multiples_of_seven		resd 1	; number of elements that are multiples of 7
	array_of_multiples_of_seven	resd 1	; address of the multiples of 7 array

segment .text
        global  asm_main
asm_main:
        enter   0,0 
        pusha

	;;;  Get input array ;;;;
        ;;;;;;;;;;;;;;;;;;;;;;;;;
	push	num_elements		; push argument
	call	getInputArray		; call getInputArray
	add	esp, 4			; clean up the stack
	mov	[array_address], eax	; save the address of the input array

	cmp	eax, -42		; Is the function not implemented?
	jz	near the_end

	;;;  Print input array ;;;;
	;;;;;;;;;;;;;;;;;;;;;;;;;;;
	mov	eax, msg1		; print msg1
	call	print_string		; 
	mov	eax, [num_elements]	; print number of elements in input array
	call	print_int		; 
	mov	eax, msg2		; print msg2
	call	print_string		; 
	mov	ecx, [num_elements]	; ecx = number of input values (loop index)
print_loop:
	mov	ebx, [array_address]	; ebx = address of the input array
	add	ebx, [num_elements]	; ebx = address of the last element + 1 byte
	sub	ebx, ecx		; ebx = address of the current element
	mov	al, [ebx]		; al = current element
	movzx   eax, al			; size-extend it into eax and print it
	call	print_int		; 
	mov	al, ' '			; print a white space
	call	print_char		; 
	loop	print_loop		; loop back if not done
	call	print_nl		; print carriage return

	;;;  Find the index of the first power of two value ;;;;		
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	push	is_a_power_of_two	; push the function pointer
	push	dword [num_elements]	; push the number of input array elements
	push	dword [array_address]	; push the input array address
	call	findFirstIndex		; call findFirstIndex
	add	esp, 12			; clean up the stack
	mov	ebx, eax		; ebx = index of the first power of two value

	cmp	eax, -42		; Is the function not implemented?
	jz	near the_end

	mov	eax, msg3		; print msg3
	call	print_string		; 
	mov	eax, ebx		; print index of the first power of two value
	call	print_int		; 
	call	print_nl		; print carriage return

	;;;  Find first multiple of 7 value ;;;
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	push	is_a_multiple_of_seven	; push the function pointer
	push	dword [num_elements]	; push the number of input array elements
	push	dword [array_address]	; push the input array address
	call	findFirstIndex		; call findFirstIndex
	add	esp, 12			; clearn up the stack
	mov	ebx, eax		; ebx = index of the first multiple of 7 value

	cmp	eax, -42		; Is the function not implemented?
	jz	near the_end

	mov	eax, msg4		; print msg4
	call	print_string		;	
	mov	eax, ebx		; print index of the first multiple of 7 value
	call	print_int		; 
	call	print_nl		; print carriage return

	;;;  Find all powers of 2 values ;;;
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	push	num_powers_of_two	; push the address of the powers of two count 
	push	is_a_power_of_two	; push the function pointer
	push	dword [num_elements]	; push the number of input array elements
	push	dword [array_address]	; push the input array address
	call	findAllIndices		; call findAllIndices
	add	esp, 16			; clean up the stack

	cmp	eax, -42		; Is the function not implemented?
	jz	near the_end

	mov	[array_of_powers_of_two], eax	; save the address of the powers of two array

	mov	eax, [num_powers_of_two]; print the numbers of powers of two
	call	print_int		;
	mov	eax, msg5		; print msg5
	call	print_string		;
	call	print_nl		; print carriage return

	;;;  Print index of all powers of 2 values ;;;
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

	cmp	dword [num_powers_of_two], 0	; if number of powers of two is 0
	jz	no_powers_of_two		; then do nothing
	mov	eax, msg6		; print msg6
	call	print_string		; 

	mov	ecx, [num_powers_of_two]	; ecx = number of powers of two 
	mov	ebx, [array_of_powers_of_two]	; ebx = address of arrays of powers of two
print_loop_2:
	mov	eax, [ebx]			; eax = current index
	call	print_int			; print it
	mov	al, ' '				; print white space
	call	print_char			; 
	add	ebx, 4				; ebx points to next index
	dec	ecx				; loop index -= 1
	jnz	print_loop_2			; loop back if not done
	call	print_nl			; print carriage return
no_powers_of_two:
		

	;;;  Find all multiples of 7 values ;;;
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

	push	num_multiples_of_seven	; push the address of the multiples of seven count 
	push	is_a_multiple_of_seven	; push the function pointer
	push	dword [num_elements]	; push the number of input array elements
	push	dword [array_address]	; push the input array address
	call	findAllIndices		; call findAllIndices
	add	esp, 16			; clean up the stack
	mov	[array_of_multiples_of_seven], eax  ; save the address of the powers of two array

	cmp	eax, -42		; Is the function not implemented?
	jz	near the_end
	
	mov	eax, [num_multiples_of_seven]	; print the numbers of multiples of seven
	call	print_int		     	;
	mov	eax, msg7			; print msg7
	call	print_string			;
	call	print_nl			; print carriage return

	;;;  Print index of all multiples of 7 values ;;;
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

	cmp	dword [num_multiples_of_seven], 0	; if number of multples of 7 is 0
	jz	no_multiples_of_seven			; then do nothing
	mov	eax, msg8				; print msg8
	call	print_string				;

	mov	ecx, [num_multiples_of_seven]		; ecx = number of multiples of 7
	mov	ebx, [array_of_multiples_of_seven]	; ebx = address of array of multiples of 7
print_loop_7:
	mov	eax, [ebx]				; eax = current index
	call	print_int				; print it
	mov	al, ' '					; print white space
	call	print_char				; 
	add	ebx, 4					; ebx points to the next index
	dec	ecx					; loop index -= 1
	jnz	print_loop_7				; loop back if not done
	call	print_nl				; print carriage return
no_multiples_of_seven:


the_end:

        popa
        mov     eax, 0 
        leave
        ret


;;; Function that takes a single 4-byte argument and returns 1  ;;;
;;; if that argument is a power of 2, and 0 otherwise           ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
is_a_power_of_two:
	enter	0,0
	pusha	

	mov	eax, 0		; eax = bit count
	mov	ebx, [ebp+8]	; ebx = argument
	
count_loop:
	shl	ebx, 1		; shift left
	adc	eax, 0		; eax += carry
	cmp	ebx, 0		; if ebx == 0, we're done (not most efficient)
	jnz	count_loop	; 

	cmp	eax,1		; if the counts is not exactly 1
	jz	a_power_of_two		; 
	mov	eax, 0		; then set it to 0
a_power_of_two:
	mov	[ebp-4], eax
	popa			
	mov	eax, [ebp-4]
	leave
	ret


;;; Function that takes a single 4-byte argument and returns 1  ;;;
;;; if that argument is a multiple of 7, and 0 otherwise        ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
is_a_multiple_of_seven:
	enter	4,0
	pusha	

	mov	edx, 0		; edx = 0
	mov	eax, [ebp+8]	; eax = argument
	mov	ecx, 7		; ecx = 7
	idiv	ecx		; divide argument by 7
	mov	eax, 0		; eax = 0
	cmp	edx, 0		; if remainder != 0
	jnz	not_a_multiple	; jump
	mov	eax, 1		; eax = 1
not_a_multiple:
	mov	[ebp-4], eax
	popa
	mov	eax, [ebp-4]
	leave
	ret

