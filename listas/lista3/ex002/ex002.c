// 2. Faça um programa em C que leia uma string e um caractere do usuario e informe se a string de
// entrada contém o caracter fornecido.

#include <stdio.h>

int main(void){
    char string[61];
    char c[0];

    printf("Digite o texto a ser analisado: ");
    scanf("%s", string);
    printf("\nDigite o carcter que você quer procurar: ");
    scanf("%s", c);

    for(int i=0 ; string[i] != '\0' ; i++){
        if(c[0] == string[i]){
            printf("O caracter pertence ao texto");
            break;
        }
    }

    return 0;
}