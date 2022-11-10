// Faça um programa em C que leia um vetor do tipo float com 15 elementos e apresente a soma do
// menor e maior elemento do vetor fornecido.

#include <stdio.h>

#define TAM 15
int main(void){
    float vetor[TAM], num, maior=0.0, menor=0.0;

    //recebe o vetor
    for(int i=0 ; i<TAM ; i++){
        printf("digite o valor para a posição [%d]: ", i);
        scanf("%f", &num);
        vetor[i] = num;
    }
    maior = vetor[0];
    menor = vetor[0];
    for(int i=0 ; i<TAM ; i++){
        if(vetor[i]>maior){
            maior = vetor[i];
        }
        if(vetor[i] < menor){
            menor = vetor[i];
        }
    }

    printf("\n\n Maior: %f\n", maior);
    printf(" Menor: %f", menor);
    printf("\nA soma dos valores é %f\n", maior + menor);

    return 0;
}