// Escreva um programa em C que retorne o endereço do primeiro elemento par de um vetor X com dimensões alocadas dinamicamente.
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[]){
    int k, *vetorX;

    k = atoi(argv[1]);

    srand(time(NULL));

    vetorX = (int *) malloc(k * sizeof(int));

    for(int i=0 ; i<k ; i++){
        *(vetorX + i) = rand() % 10;
        printf("%d ", *(vetorX + i));
    }

    for(int i=0 ; i<k ; i++){
        if(*(vetorX + i) % 2 == 0){
            printf("\nnumero: %d\n", *(vetorX + i));
            printf("endereço: %p\n", (vetorX + i));
            break;
        }
    }

    free(vetorX);
    return 0;
}