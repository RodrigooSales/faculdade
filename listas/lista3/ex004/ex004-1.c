// 4. Faça um programa em C que leia duas strings do usuário e informe se elas são iguais. Faça uma
// versão com o uso da função strcmp() e outra sem.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TAM 100
int main(void){
    char string1[TAM], string2[TAM];
    
    printf("Digite a primeria string: ");
    scanf("%s", string1);
    printf("Digite a segunda string: ");
    scanf("%s", string2);

    if(!strcmp(string1, string2)){
        printf("As strings são iguais!");
    }
    else{
        printf("As strings são diferentes!");
    }

    return 0;
}