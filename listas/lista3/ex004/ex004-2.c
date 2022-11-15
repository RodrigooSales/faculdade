// 4. Faça um programa em C que leia duas strings do usuário e informe se elas são iguais. Faça uma
// versão com o uso da função strcmp() e outra sem.

#include <stdio.h>
#include <stdlib.h>

#define TAM 100
int main(void){
    char string1[TAM], string2[TAM];
    int aux;
    
    printf("Digite a primeria string: ");
    fgets(string1, TAM, stdin);
    printf("Digite a segunda string: ");
    fgets(string2, TAM, stdin);

    for(int i=0 ; i < TAM ; i++){
        if(string1[i] == string2[i]){
            aux = 1;
        }
        else{
            aux = 0;
        }
    }

    if(aux == 1){
        printf("As strings são iguais!\n");
    }
    else if(aux == 0){
        printf("As strings são diferentes!\n");
    }

    return 0;
}