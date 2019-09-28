%include "asm_io.inc"
%define _malloc  malloc
extern	_malloc

segment .data
	getInputArray_not_implemented		db	"getInputArray not implemented!", 0
	findFirstIndex_not_implemented		db	"findFirstIndex not implemented!", 0
	findAllIndices_not_implemented		db	"findAllIndices not implemented!", 0

segment .text

global getInputArray
global findFirstIndex
global findAllIndices

;;;  Helper function to allocate memory         ;;;
;;;   - arg#1: number of bytes to allocate      ;;;
;;;  returns a pointer to allocated memory zone ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

allocate_memory:
        enter   4,0
        pusha
        pushf

        push    dword [ebp+8]
        call    _malloc
        pop     ecx
        mov     [ebp-4], eax
        popf
        popa
        mov     eax, [ebp-4]
        leave
        ret


;;;  getInputArray function (TO BE IMPLEMENTED)  ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

getInputArray:
	; push ebp
	; mov ebp, esp
	; make two local variables
	enter	8, 0


	; Reads an int and stores it into parameter
	call read_int
	mov ebx, [ebp+8]
	mov [ebx], eax

	; allocates memory for the array
	push eax
	call allocate_memory
	add esp, 4
	mov [ebp-4], eax

	; Sets up for the foor loop
	mov ebx, [ebx] ; # of elements
	mov dword [ebp-8], 0 ; counter
	mov ecx, [ebp-4] ; address of array
	
	; Calls the loop, taking input and storing it in the array
n_loop:
	call read_int
	add ecx, [ebp-8]
	mov byte [ecx], al
	add dword [ebp-8], 1
	cmp ebx, [ebp-8]
	je finish
	mov ecx, [ebp-4]
	jmp n_loop
	
	; Returns the address of the array
finish:
	mov eax, [ebp-4]

	leave
	ret

;;;  findFirstIndex function (TO BE IMPLEMENTED)  ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

findFirstIndex:
	enter	8, 0

	mov ebx, 0
	mov dword [ebp-4], 1
loop_through:
	mov ecx, [ebp+8]
	add ecx, ebx
	movzx eax, byte [ecx]
	
	push eax
	call [ebp+16]
	add esp, 4	
	
	cmp eax, [ebp-4]
	je is_one

	inc ebx
	cmp ebx, [ebp+12]
	je finish_loop_through
	mov ecx, [ebp+8]
	jmp loop_through

finish_loop_through:
	
	mov eax, -1
	jmp neg_one

is_one:

	mov eax, ebx

neg_one:

	leave
	ret

;;;  findAllIndices function (TO BE IMPLEMENTED)  ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

findAllIndices:
	enter	8, 0

	mov ebx, 0 ; array counter
	mov edx, 0 ; # of 1s returned by fun
loop_through_two:
	mov ecx, [ebp+8]
	add ecx, ebx
	movzx eax, byte [ecx]
	
	push eax
	call [ebp+16]
	add esp, 4	
	
	cmp eax, 1
	jne skip_inc
	inc edx

skip_inc:

	inc ebx
	cmp ebx, [ebp+12]
	je finish_loop_through_two
	mov ecx, [ebp+8]
	jmp loop_through_two

finish_loop_through_two:
	
	mov eax, [ebp+20]
	mov [eax], edx


	shl edx, 2
	push edx
	call allocate_memory
	add esp, 4
	mov [ebp-8], eax

	mov ebx, 0
loop_through_three:
	mov ecx, [ebp+8]
	add ecx, ebx
	movzx eax, byte [ecx]
	
	push eax
	call [ebp+16]
	add esp, 4	
	
	cmp eax, 1
	jne skip_write
	mov eax, [ebp-8]
	mov esi, ebx
	shl esi, 2
	add eax, esi
	mov [eax], ebx
	

skip_write:

	inc ebx
	cmp ebx, [ebp+12]
	je finish_loop_through_two
	mov ecx, [ebp+8]
	jmp loop_through_two

finish_loop_through_three:

	mov eax, [ebp-8]

	leave
	ret	
