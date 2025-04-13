#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

TDatos obtener_abc(int8_t);

typedef struct {

	int8_t OpB,OpA,CodOperacion;

}TDatos;

int main()
{

 TDatos abc ;
 int8_t instruccion ;

   // While (fread(&instrucción , sizeof(int8_t) , 1 , archb) == 1){

        ABC = obtener_abc(instruccion);
        EjecutarOperacion(ABC);


    return 0;
}

void EjecutarOperacion(TDatos abc){

    switch (abc.CodOperacion){

        case 0x00 : MOV(ABC);
            break;
        case 0x01 : MOV(ABC);
            break;
        case 0x02 : MOV(ABC);
            break;
        case 0x03 : MOV(ABC);
            break;
        case 0x04 : MOV(ABC);
            break;
        case 0x05 : MOV(ABC);
            break;
        case 0x07 : MOV(ABC);
            break;
        case 0x08 : MOV(ABC);
            break;
        case 0x0F : MOV(ABC);
            break;
        case 0x10 : MOV(ABC);
            break;
        case 0x11 : MOV(ABC);
            break;
        case 0x12 : MOV(ABC);
            break;
        case 0x13 : MOV(ABC);
            break;
        case 0x15 : MOV(ABC);
            break;
        case 0x16 : MOV(ABC);
            break;
        case 0x17 : MOV(ABC);
            break;
        case 0x19 : MOV(ABC);
            break;
        case 0x1A : MOV(ABC);
            break;
        case 0x1B : MOV(ABC);
            break;
        case 0x1C : MOV(ABC);
            break;
        case 0x1D : MOV(ABC);
            break;
        case 0x1E : MOV(ABC);
            break;

    }
}

TDatos obtener_abc(int8_t instruccion){

	Tdatos aux;

	aux.OpB = (instruccion >> 6 ) & 0x3 ;
	aux.OpA = (instrucción >> 4 ) & 0x3 ;
	aux.CodOperacion = instruccion & 0x1F ;

	return aux;

}
