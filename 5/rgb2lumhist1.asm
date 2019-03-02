%include "asm_io.inc"

segment .data
	bin times 75 dd 0
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
	
	
	cmp ebx, 740 ; Compare 740 and ebx
	jbe its_75 	; If ebx >= 740 its bin 75

	cmp 9, ebx	; Compare 84 and ebx
	jae its_1	; If ebx <= 84 its period

	cmp 19, ebx
	jae its_2

	cmp 29, ebx
	jae its_3

	cmp 39, ebx
	jae its_4

	cmp 49, ebx
	jae its_5

	cmp 59, ebx
	jae its_6

	cmp 69, ebx
	jae its_7

	cmp 79, ebx
	jae its_8

	cmp 89, ebx
	jae its_9

	cmp 99, ebx
	jae its_10

	cmp 109, ebx
	jae its_11

	cmp 119, ebx
	jae its_12

	cmp 129, ebx
	jae its_13

	cmp 139, ebx
	jae its_14

	cmp 149, ebx
	jae its_15

	cmp 159, ebx
	jae its_16

	cmp 169, ebx
	jae its_17

	cmp 179, ebx
	jae its_18

	cmp 189, ebx
	jae its_19

	cmp 199, ebx
	jae its_20

	cmp 209, ebx
	jae its_21

	cmp 219, ebx
	jae its_22

	cmp 229, ebx
	jae its_23

	cmp 239, ebx
	jae its_24

	cmp 249, ebx
	jae its_25

	cmp 259, ebx
	jae its_26

	cmp 269, ebx
	jae its_27

	cmp 279, ebx
	jae its_28

	cmp 289, ebx
	jae its_29

	cmp 299, ebx
	jae its_30

	cmp 309, ebx
	jae its_31

	cmp 319, ebx
	jae its_32

	cmp 329, ebx
	jae its_33

	cmp 339, ebx
	jae its_34

	cmp 349, ebx
	jae its_35

	cmp 359, ebx
	jae its_36

	cmp 369, ebx
	jae its_37

	cmp 379, ebx
	jae its_38

	cmp 389, ebx
	jae its_39

	cmp 399, ebx
	jae its_40

	cmp 409, ebx
	jae its_41

	cmp 419, ebx
	jae its_42

	cmp 429, ebx
	jae its_43

	cmp 439, ebx
	jae its_44

	cmp 449, ebx
	jae its_45

	cmp 459, ebx
	jae its_46

	cmp 469, ebx
	jae its_47

	cmp 479, ebx
	jae its_48

	cmp 489, ebx
	jae its_49

	cmp 499, ebx
	jae its_50

	cmp 509, ebx
	jae its_51

	cmp 519, ebx
	jae its_52

	cmp 529, ebx
	jae its_53

	cmp 539, ebx
	jae its_54

	cmp 549, ebx
	jae its_55

	cmp 559, ebx
	jae its_56

	cmp 569, ebx
	jae its_57

	cmp 579, ebx
	jae its_58

	cmp 589, ebx
	jae its_59

	cmp 599, ebx
	jae its_60

	cmp 609, ebx
	jae its_61

	cmp 619, ebx
	jae its_62

	cmp 629, ebx
	jae its_63

	cmp 639, ebx
	jae its_64

	cmp 649, ebx
	jae its_65

	cmp 659, ebx
	jae its_66

	cmp 669, ebx
	jae its_67

	cmp 679, ebx
	jae its_68

	cmp 689, ebx
	jae its_69

	cmp 699, ebx
	jae its_70

	cmp 709, ebx
	jae its_71

	cmp 719, ebx
	jae its_72

	cmp 729, ebx
	jae its_73

	cmp 739, ebx
	jae its_74


its_1:
	mov eax, [bin]
	inc eax
	mov [bin], eax
	jmp end

its_2:
	mov  eax, bin
	add eax, 4
	
	dec eax
	call print_char
	jmp end

its_3:
	mov eax, [comma]
	call print_char
	call print_char
	jmp end

its_4:
	mov eax, [colon]
	call print_char
	call print_char
	jmp end
its_5:
	mov eax, [i]
	call print_char
	call print_char
	jmp end

its_6:
	mov eax, [l]
	call print_char
	call print_char
	jmp end

its_7:
	mov eax, [w]
	call print_char
	call print_char
	jmp end

its_8:
	mov eax, [X]
	call print_char
	call print_char
	jmp end
its_9:
	mov eax, [W]
	call print_char
	call print_char

its_10:

its_11:

its_12:

its_13:

its_14:

its_15:

its_16:

its_17:

its_18:

its_19:

its_20:

its_21:

its_22:

its_23:

its_24:

its_25:

its_26:

its_27:

its_28:

its_29:

its_30:

its_31:

its_32:

its_33:

its_34:

its_35:

its_36:

its_37:

its_38:

its_39:

its_40:

its_41:

its_42:

its_43:

its_44:

its_45:

its_46:

its_47:

its_48:

its_49:

its_50:

its_51:

its_52:

its_53:

its_54:

its_55:

its_56:

its_57:

its_58:

its_59:

its_60:

its_61:

its_62:

its_63:

its_64:

its_65:

its_66:

its_67:

its_68:

its_69:

its_70:

its_71:

its_72:

its_73:

its_74:

its_75:

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

