#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#define TOTAL 30

void Disassembler(Componentes,TDatos,int);

int main()
{

    Disassembler(comp,abc,i);

}

void Disassembler(Componentes comp,TDatos abc, int i)
{
    char Operaciones[TOTAL] = {"SYS","JMP","JZ","JP","JN","JNZ","JNP","JNN","NOT","","","","","","STOP","MOV","ADD","SUB","SWAP","MUL","DIV","CMP","SHL","SHR","AND","OR","XOR","LDL","LDH","RND"};
    int32_t auxb,auxa;

    printf("[%04d]\t %X",i,comp.memoria[i]);
    // Muestra los valores en hexadecimal.
    Op_AB(abc.OpB,comp,&auxb);
    Op_AB(abc.OpA,comp,&auxa);
    printf("|\t");

    Significado(abc.OpA,auxa);
    Significado(abc.OpB,auxb);
    printf("\n");

}

void Op_AB(int8_t Op, Componentes comp, int32_t *aux)
{

   int final,inicio;

   switch(Op){

        case 0b01 : //Es registro

            final = 1;
            break;

        case 0b10 :

            final = 2;
            break;

        case 0b11 :

            final = 3;
            break;

   }

   for (inicio=i ; inicio<= final ; i++){

        *aux = *aux << 8;
        printf("%X\t",comp.memoria[inicio]);
        *aux = comp.memoria[inicio];

   }



}

void Significado(int8_t op, int32_t auxiliar){

    switch(op){
    case 0b01:
        aux1

    }

}


