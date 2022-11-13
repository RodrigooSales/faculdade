// 3. Faça um programa em C que leia uma string do usuário e informe a quantidade de caracteres da
// string fornecida. Não use a função strlen().

#include <stdio.h>

int main(void){
    char string[100];
    int count;

    printf("Digite o texto a ser lido: ");
    scanf("%s", string);

    for(int i ; string[i] != '\0' ; i++){
        count++;
    }

    printf("O tamanho da palavra é: %d\n", count);
}