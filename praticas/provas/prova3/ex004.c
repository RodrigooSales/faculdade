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
