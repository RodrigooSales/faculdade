// Faça um programa em C que leia um vetor do tipo float com 15 elementos e apresente a soma do
// menor e maior elemento do vetor fornecido.

#include <stdio.h>

#define TAM 15
int main(void){
    float vetor[TAM], num, maior, menor;

    //recebe o vetor
    for(int i=0 ; i<TAM ; i++){
        printf("digite o valor para a posição %d", i);
        scanf("%f", &num);
        vetor[i] = num;
    }

    for(int j ; j<TAM ; j++){

    }
}