#include "function.h"

int somatorio(struct vetores *vetor){
    int soma = 0;

    for(int i=0 ; i < vetor -> qtd ; i++){
        soma += *(vetor->v + i);
    }

    return soma;
}