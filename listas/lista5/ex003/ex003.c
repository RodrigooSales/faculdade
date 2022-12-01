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
    int *ptrMaior, *ptrMenor;
    char * ends[2];

    ptrMaior = &maior;
    ptrMenor = &menor;

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

    ends[0] = (char *) &ptrMaior;
    ends[1] = (char *) &ptrMenor;

    for(int i=0 ; i<2 ; i++){
        printf("%s\n", ends[i]);
    }

    return 0;
}
