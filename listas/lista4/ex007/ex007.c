// 7. Escreva um programa que concatene duas strings utilizando ponteiros.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void concatena(char *string1, char *string2, char *concatenada){
    while(*string1){
        *concatenada = *string1;
        concatenada += 1;
        string1 +=1;
    }

    while(*string2){
        *concatenada = *string2;
        concatenada += 1;
        string2 +=1;
    }

    *concatenada = '\0';
}

#define TAM 50

int main(void){
    char string1[TAM], string2[TAM];
    char *concatenada[TAM] = (char*) malloc(((int)strlen(string1) + (int)strlen(string2)+1)*sizeof(char));

    printf("Digite a primeira string: ");
    scanf("%s", &string1);

    printf("Digite a segunda string: ");
    scanf("%s", &string2);

    concatena(string1, string2, concatenada);

    printf("%s", concatenada);

    return 0;
}