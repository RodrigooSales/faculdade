#include <stdio.h>
#include <stdlib.h>
#include "function.h"

int main(void){
    struct vetores vetor;
    int soma;
    printf("Digite o tamanho do vetor: ");
    scanf("%d", &vetor.qtd);
    srand(time(NULL));

    vetor.v = (int *) malloc(vetor.qtd * sizeof(int));

    for(int i = 0 ; i<vetor.qtd ; i++){
        *(vetor.v + i) = rand() % 10;
    }

    for(int i=0 ; i<vetor.qtd ; i++){
        printf("%d ", *(vetor.v + i));
    }

    soma = somatorio(&vetor);
    printf("O valor do somatorio é: %d\n", soma);

    return 0;
}