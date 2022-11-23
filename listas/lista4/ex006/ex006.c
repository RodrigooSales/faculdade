// 6. Escreva um programa que copie uma string para outra usando ponteiros.

#include <stdio.h>
#include <stdlib.h>

#define TAM 100

void copiaString(char *copiar, char *colar){
    while(*copiar != '\0'){
        *colar = *copiar;
        ++copiar;
        ++colar;
    }
    *colar = '\0';
}

int main(void){
    char strin1[TAM], string2[TAM];

    printf("Digite a primeira string para ser copiada: ");
    scanf("%s", strin1);

    copiaString(strin1, string2);
    printf("A string foi colada na string de numero 2!\n");
    printf("%s\n", string2);
    return 0;
}