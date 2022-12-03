// 6. Escreva um programa em C que apresente a média, a mediana e a moda de um vetor de inteiros
// gerados aleatoriamente em tempo de execução.

#include <stdio.h>
#include <stdlib.h>

int media(){

}

int mediana(){

}

int moda(){

}

int main(int argc, char **argv){
    int *v, soma = 0;
    int TAM = atoi(argv[1]);

    srand(time(NULL));

    v = (int *) malloc(TAM * sizeof(int));

    for(int i=0 ; i<TAM ; i++){
        *(v+i) = rand() % 10;
        soma = soma + *(v+1);
    }

    for(int i=0 ; i<TAM ; i++){
        printf("%.2f ", *(v+i));
    }
}