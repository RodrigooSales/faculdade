// 7. Faça um programa em C que gere um vetor com 3 números inteiros pseudoaleatórios no intervalo
// [0, 19] e apresente a sua média aritmética e geométrica.

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

#define TAM 3
int main(void){
    int vetor[TAM];
    float mediaA = 0.0, mediaG = 0.0;
    srand(time(NULL));

    for (int i = 0 ; i < 3 ; i++){
        vetor[i] = rand() % 20;
    }

    for (int i = 0 ; i < 3 ; i++){
        printf("%d ", vetor[i]);
    }

    mediaA = (float) (vetor[0]+vetor[1]+vetor[2])/3;
    mediaG = pow((vetor[0] + vetor[1] + vetor[2]), (float) 1/3);

    printf("\nA media Aritmetica é igual a %f\n", mediaA);
    printf("A media Geometrica é igual a %f\n", mediaG);
    return 0;
}