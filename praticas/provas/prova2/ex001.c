// Escreva um programa que dado um vetor A com dimensão k, armazene em B os elementos pares de A. O valor de K deve ser fornecido por linha de comando.
// Se A não tiver valor par, uma mensagemd deve aparecer na tela.

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[]){

    int *vetorA, *vetorB;
    int i, k, count = 0, j=0;

    k = atoi(argv[1]);

    vetorA = (int *) malloc(k * sizeof(int));
    srand(time(NULL));
    
    for(i=0 ; i<k ; i++){
        *(vetorA + i) = rand() % 10;
    }

    puts("O vetor gerado é: \n");
    for(i=0 ; i<k ; i++){
        printf("%d ", *(vetorA + i));
    }

    printf("\n");

    for(i=0 ; i<k ; i++){
        if(*(vetorA + i) % 2 == 0){
            count++;
        }
    }

    if(count == 0){
        puts("Nenhum numero par encontrado no vetor");
        exit(1);
    }

    vetorB = (int *) malloc(count * sizeof(int));
    for(i = 0 ; i<k ; i++){
        if(*(vetorA + i) % 2 == 0){
            *(vetorB + j++) = *(vetorA + i);
        }
    }

    puts("O vetor B gerado é: \n");
    for(i=0 ; i<count ; i++){
        printf("%d ", *(vetorB + i));
    }

    printf("\n");

    free(vetorA);
    free(vetorB);

    return 0;
}