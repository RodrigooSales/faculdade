// 3. Modifique a questão anterior criando uma função que armazena em um vetor os endereços do menor
// e do maior elemento do vetor.

#include <stdio.h>
#include <stdlib.h>

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

    srand(time(NULL));

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
