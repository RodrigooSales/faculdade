// 6. Escreva um programa que copie uma string para outra usando ponteiros. 7120

#include <stdio.h>
#include <stdlib.h>

#define TAM 100

void copiaString(char *copia, char *cola){
    *cola = *copia;
    ++copia;
    ++cola;
}

int main(void){
    char strin1[TAM], string2[TAM];

    printf("Digite a primeira string para ser copiada: ");
    scanf("%s", strin1);

    printf("A string foi colada na string de numero 2!\n");
    printf("String 2: %s", copiaString(strin1, string2));
}