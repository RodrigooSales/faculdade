// Escreva um programa que receba dois valores (a e p) do usuario, onde a corresponde a um byte e p é a posição especifica de um bit dentro
// do byte a. O programa deverá desligar o bit na posição p no byte a dado. No final, o valor resultante deve ser impresso em hexadecimal.

#include <stdio.h>

int main(void){
    int p;

    unsigned char a, offMask = 0xFF, positionMask = 0x01;

    printf("Digite o caractere que representa um byte: ");
    scanf("%c", &a);
    printf("Qual posição do bit que deseja desligar: ");
    scanf("%d", &p);

    positionMask = positionMask << p;
    offMask = offMask ^ positionMask;

    a = a &offMask;

    printf("Com esse bit desligado o caractere corresponde a %x\n", a);

    return 0;
}
