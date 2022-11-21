// 5. Escreva um programa que encontre o tamanho de uma string fornecida. Utilize ponteiros.

#include <stdio.h>
#include <stdlib.h>

#define TAM 100

int tamanhoString(char *s){
    char *ptr = s;
    while(*s != '\0'){
        s++;
    }

    return (int)(s-ptr);
}

int main(){
    char string[TAM];

    printf("Digite a string: ");
    scanf("%s", string);

    printf("O tamanho da string é de: %d\n", tamanhoString(string));
    return 0;
}
