// 3. Escreva um programa em C que gere um vetor com números aleatórios e calcule sua média. Orga-
// nize uma Estrutura com as seguintes informações: ponteiro para a matriz, quantidade de elementos
// e a média.

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct matriz{
    int *ptr;
    int TAM;
    float media;
};

int main (void){
    int *vetor=NULL, TAM = 10;
    float media = 0;

    struct matriz mat;
    srand(time(NULL));
    
    vetor = (int *) malloc(TAM * sizeof(int));

    for(int i=0 ; i<TAM ; i++){
        *(vetor + i) = rand() % 10;
    }

    for(int i=0 ; i<TAM ; i++){
        media += *(vetor+i);
    }

    mat.ptr = vetor;
    mat.TAM = TAM;
    mat.media = media/TAM;

    for (int i=0; i<TAM; i++){
        printf("%d ", *(vetor+i));
    }

    printf("\n%p\n%d\n%.2f\n",mat.ptr, mat.TAM, mat.media);

    free(vetor);
    return 0;
}