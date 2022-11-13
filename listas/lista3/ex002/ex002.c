// 2. Faça um programa em C que leia uma string e um caractere do usuario e informe se a string de
// entrada contém o caracter fornecido.

#include <stdio.h>

int main(void){
    char string[61];
    char c;
    printf("Digite o carcter que você quer procurar: ");
    scanf("%c", &c);

    printf("Digite o texto a ser analisado: ");
    scanf("%s", string);


    for(int i=0 ; string[i] != '\0' ; i++){
        if(c == string[i]){
            printf("O caracter pertence ao texto na posição [%d]\n", i);
        }
        else{
            printf("O caracter não pertence ao texto na posição[%d]\n", i);
        }
    }

    return 0;
}