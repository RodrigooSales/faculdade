<<<<<<< HEAD
typedef struct{
    int x;
    node *prox;
}node;

void printNextValue(node *current){
    if(current -> prox == NULL){
        puts("Esse é o ultimo elemento da lista");
    } else {
        printf("%d", current -> prox -> x);
    }
}
=======
typedef struct{
    int x;
    node *prox;
}node;

void printNextValue(node *current){
    if(current -> prox == NULL){
        puts("Esse é o ultimo elemento da lista");
    } else {
        printf("%d", current -> prox -> x);
    }
}
>>>>>>> 670b63ac06f068f87f5403d44752f1e6000e3331
