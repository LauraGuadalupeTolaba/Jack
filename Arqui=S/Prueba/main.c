#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#define TOTAL 31
#define TOTALR 17

typedef struct{
	uint8_t tipo;
	int operando;
}Toperando;

typedef struct {

	int8_t OpB,OpA,CodOperacion;

}TDatos;

typedef struct{
	uint8_t memoria[20];
	int tabladesegmentos[10][10];
	int error;
	int registros[17];
}Componentes;

typedef char stringg[5];


TDatos obtener_abc(int8_t);
void EjecutarOperacion(TDatos);
void LeeArchivo(Componentes);
void Disassembler(Componentes,TDatos,int*);
void Op_AB(int8_t , Componentes , int32_t *,int*);
void Significado(int8_t , int32_t);

int main()
{
    TDatos abc;
    Componentes comp;
    int i =0,fin=12;
    int8_t instruccion;

    comp.memoria[0]=0xB1;
    comp.memoria[1]=0x00;
    comp.memoria[2]=0x0A;
    comp.memoria[3]=0x00;
    comp.memoria[4]=0x05;
    comp.memoria[5]=0x10;
    comp.memoria[6]=0x97;
    comp.memoria[7]=0x00;
    comp.memoria[8]=0x10;
    comp.memoria[9]=0xA0;
    comp.memoria[10]=0x48;
    comp.memoria[11]=0xEC;


    instruccion = 0x00;
    while(i<fin){
            instruccion = comp.memoria[i];
            // printf("instruccion: %02X\n",instruccion); prueba
            abc = obtener_abc(instruccion);
            // printf("OpA : %02X\t OpB : %02X\n",abc.OpA,abc.OpB); prueba
            Disassembler(comp,abc,&i);
    }


}

void Disassembler(Componentes comp,TDatos abc, int *i)
{
    stringg Operaciones[TOTAL] = {"SYS","JMP","JZ","JP","JN","JNZ","JNP","JNN","NOT","","","","","","","STOP","MOV","ADD","SUB","SWAP","MUL","DIV","CMP","SHL","SHR","AND","OR","XOR","LDL","LDH","RND"};
    int32_t auxb,auxa;
    int ind=*i;

    printf("[%04X] %02X ",ind,comp.memoria[ind]);
    // Muestra los valores en hexadecimal.
    auxa=auxb=0X0;
    Op_AB(abc.OpB,comp,&auxb,&ind);
    Op_AB(abc.OpA,comp,&auxa,&ind);

    printf(" | ");

    printf(" %s ",Operaciones[abc.CodOperacion]);

    if(abc.OpA != 0x0)
    {
        Significado(abc.OpA,auxa);
        printf(", ");
    }

    Significado(abc.OpB,auxb);
    printf("\n");
    *i=ind+1;

}

void Op_AB(int8_t Op, Componentes comp, int32_t *aux,int *i)
{

   int finall,inicio=1;

   switch(Op){

        case 0b00 :

            finall = 0; // No entra nunca al ciclo for
            break;

        case 0b01 :     // Es registro

            finall = 1;
            break;

        case 0b10 :     // Es inmediato

            finall = 2;
            break;

        case 0b11 :     // Es memoria

            finall = 3;
            break;

   }


    while ( inicio <= finall ){

        (*i)++;
        *aux = *aux << 8;
        printf(" %02X ",comp.memoria[*i]);
        *aux =(*aux) | comp.memoria[*i];
        inicio ++;

   }

}

void Significado(int8_t op, int32_t auxiliar){

    int8_t aux1=0,aux2=0;
    stringg Registross[TOTALR] = {"CS","DS"," "," "," ","IP"," "," ","CC","AC","EAX","EBX","ECX","EDX","EEX","EFX"};

    switch(op){

        case 0b01:

            aux1 = (auxiliar >> 2) & 0x03;
            aux2 = (auxiliar >> 4) & 0x0F;
            if(aux1 == 0b00)                                        // Registro completo

                printf("%s",Registross[aux2]);

            else
                if (aux1 == 0b01)                                  // 1 byte de registro (XL)

                    printf("%cL",Registross[aux1][1]);

                else
                        if(aux1 == 0b10)

                            printf("%cH",Registross[aux2][1]);     // 1 byte de registro (XH)

                        else

                            printf("%cX",Registross[aux2][1]);     // 2 byte de registro (AX)
            break;

        case 0b10: // Es un inmediato

            printf("%d",auxiliar);
            break;

        case 0b11: // Es memoria

            aux1 = (auxiliar >> 4) & 0X0000000F ;
            aux2 = (auxiliar >> 8);
            if(aux2 > 0)

                printf("[%s + %d]",Registross[aux1],aux2);

            else

                printf("[%s]",Registross[aux1]);
            break;
    }
}


TDatos obtener_abc(int8_t instruccion){

	TDatos aux;

	aux.OpB = (instruccion >> 6 ) & 0x03 ;
	aux.OpA = (instruccion >> 4 ) & 0x03 ;
	aux.CodOperacion = instruccion & 0x1F ;

	return aux;

}

/**
void InsertaMemoria(Componentes comp,int dir,int dato){

int i, aux = 0;

    for (i=0;i<4;i++){
        aux = ((dato>>24)-i*8) & 0xFF;
        comp.memoria[dir+i] = aux;
    }

}


void Imprime(componentes *comp)
{

    int ind,i, no_error;
    int16_t cantidad_cl, cantidad_ch,formato;
    int32_t masc;

    ind = (*comp).registro[13] ;
    TradLogicaFisica(&ind , comp , &no_error) ;
    if(no_error == 0 )
    {

        cantidad_cl = (*comp).registro[12] & 0x0F ;
        cantidad_ch =( (*comp).registro[12] >> 4 ) & Ox0F ;
        formato = (*comp).memoria & 0x0F ;

        masc = mascara(cantidad_cl);

        printf("[04X] : ",ind);

        for( i=0 ; i < cantidad_cl ; i++)
        {

            if(formato & 0x01 == 0x01 )

                printf("%d\t",(*comp).memoria[ind] & mac );

            if(formato & 0X02 == 0x02)

                printf("%c\t",(*comp).memoria[ind] & masc );

            if(formato & 0x04 == 0x04)

                printf("%O\t",(*comp).memoria[ind] & masc );

            if(formato & 0x08 == 0x08)

                printf("%X\t",(*comp).memoria[ind] & masc );

            if (formato & 0x10 == 0x10)

                printf("%b\t",(*comp).memoria[ind] & masc );

            ind ++;
            i++;

        }
    }else

        (*comp).error = 3;

}

int32_t mascara(int16_t cantidad_cl)
{

    switch(cantidad_cl):

        case 1:

            return 0x0F;
            break;

        case 2:

            return 0xFF;
            break;

        case 3:

            return 0xFFF;
            break;

        case 4:

            return 0xFFFF;
            break;

}
**/
