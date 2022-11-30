// 1. Escreva um programa que receba dois valores por linha de execução e realize a soma ou multi-
// plicação, conforme um código de operação também recebido por linha de execução.
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv){
    int a,b;
    int choice;

    choice = atoi(argv[1]);

    //argv[0] = exec
    //argv[1] = 1 ou 2
    //argv[2] = a
    //argv[3] = b   
    a = atoi(argv[2]);
    b = atoi(argv[3]);

    if(choice == 1){
        printf("Soma: %d\n", a+b);
    }
    else if (choice == 2){
        printf("multiplicação: %d\n", a*b);   
    }

    return 0;
}