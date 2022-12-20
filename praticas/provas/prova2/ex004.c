// Dado um vetor de inteiros V e um valor t tambem inteiro, escreva uma função em c que grave em um vetor k valores 0 e 1 conforme a regra a seguir.
// Ki = {1, se Vi >t 
//      {0, caso contrario
// O vetor K deve ser acessivel fora da função.

int* function(int *V, int TAM, int *T){
    int *k;

    k = (int *) malloc(TAM * sizeof(int));

    for(int i=0 ; i<TAM ; i++){
        if(*(V + i) > *T){
            *(k + i) = 1;
        } else{
            *(k+i) = 0;
        }
    }

    return *k;
}