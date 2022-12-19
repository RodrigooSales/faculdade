//complete a tabela abaixo:
//Para todos os casos considere unsigned char x=25. Todos os casos são independentes.

#include <stdio.h>

int main(void){

    unsigned char x = 25;
    unsigned char y;
    
    //x = ++x - 7;  -> 19
    //x += (x>>2);  -> 31
    //x = (x<<1) - 0x07; -> 43
    //x = (y = 10, y -= 8, x * y - 1);  -> 49
    x = (((x>>3) % 2 == 0) ? 4 : 1);  //-> 1

    printf("%u\n", x);

    x = 25;

    return 0;
}