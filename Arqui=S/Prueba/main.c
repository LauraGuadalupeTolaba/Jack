#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>


int main()
{
    char* cad[3]={"HOla","A","X"};
    int32_t ind= 0x1;

    printf("%c\n",(cad[ind])[ind]);


    return 0;
}


