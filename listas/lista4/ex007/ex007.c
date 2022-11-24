// 7. Escreva um programa que concatene duas strings utilizando ponteiros.
#include <stdio.h>

void concatena(char *string1, int t1, char *string2,int t2 ,char *concatenada){
    for(int i=0; i<t1; i++){
        *concatenada = *string1;
        ++concatenada;
    }    

    for(int j=0; j<t2 ; j++ ){
        *(concatenada + t1) = *string2;
        ++concatenada;
    }
}

int tamanhoString(char *s){
    char *ptr = s;
    while(*s != '\0'){
        s++;
    }

    return (int)(s-ptr);
}

#define TAM 50

int main(void){
    char string1[TAM], string2[TAM], concatenada[TAM];
    int t1, t2;

    printf("Digite a primeira string: ");
    scanf("%s", &string1);

    printf("Digite a segunda string: ");
    scanf("%s", &string2);

    t1 = tamanhoString(string1);
    t2 = tamanhoString(string2);

    concatena(string1, t1, string2, t2, concatenada);

    for(int i=0; i<TAM ; i++){
        printf("%c", concatenada[i]);
    }

    return 0;
}