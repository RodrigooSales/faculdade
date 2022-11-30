// 4. Escreva um programa que dado um vetor X de inteiros, realize a seguinte normalização dos dados
// (min-max):
// X0 = (X − min(X))/(max(X) − min(X))
// onde min() e max() correspondem ao menor e maior do vetor, respectivamente.

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int min(int *ptr){

}

int max(int *ptr){
    
}

int main(int argc, char **argv){
    int TAM = 0, vetor[TAM], x;
    int *ptr;

    TAM = atoi(argv[1]);
    ptr = vetor;

    srand(time(NULL));

    for(int i=0 ; i<TAM ; i++){
        vetor[i] = rand() % 10;
    }
    
    min(*ptr)
}
