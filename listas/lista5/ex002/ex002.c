// 2. Escreva um programa em C que informe o endereço do menor elemento de um vetor de inteiros
// gerado. A quantidade de elementos desse array deve ser fornecido por linha de comando.

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void maiorMenor(int *vetor, int tamanho, int *maior, int *menor){
    int i;
    *menor = *vetor;
    *maior = *vetor;

    for(i=1 ; i<tamanho ; i++){
        if(*menor > *(vetor + i)){
            *menor = *(vetor + i);
        }
        if(*maior < *(vetor + i)){
            *maior = *(vetor + i);
        }
    }

}

int main(int argc, char **argv){
    int TAM, vetor[TAM], maior, menor;

    TAM = atoi(argv[1]);

    for(int i=0 ; i<TAM ; i++){
        vetor[i] = rand() % 10;
    }
    
    printf("\n\n");
    for(int i = 0; i < 10; i++)
        printf("%d ", vetor[i]);
    printf("\n\n");

    maiorMenor(vetor, TAM, &maior, &menor);

    printf("Maior: %d, seu Endereço: %p\n", maior, &maior);
    printf("Menor: %d, seu Endereço: %p\n", menor, &menor);

    return 0;
}
