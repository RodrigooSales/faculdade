// 5. Escreva um programa que some todos os elementos de um vetor de float alocado dinamicamente.
// A quantidade de elementos devem ser fornecidas por linha de comando. Utilize a função rand()
// para alimentar o vetor com valores pseudo-aleatórios.

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char **argv){
    float *v, soma = 0;
    int TAM = atoi(argv[1]);

    srand(time(NULL));

    v = (float *) malloc(TAM * sizeof(float));

    for(int i=0 ; i<TAM ; i++){
        *(v+i) = rand()%1000/100.0;
        soma = soma + *(v+1);
    }

    for(int i=0 ; i<TAM ; i++){
        printf("%.2f ", *(v+i));
    }

    printf("\nSoma= %.2f\n", soma);
}