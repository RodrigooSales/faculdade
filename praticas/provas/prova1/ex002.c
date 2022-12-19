// Na Matematica, um produtorio é definido como: ... Com base na equação na equação e, considerando que Xi = i + 1/i, com i > 0 
//Escreva um programa em linguagem C que receba os parametros de limite inferior m e de limite superior n. calcule e mostre o resultado do produtorio.

#include <stdio.h>

int main(void){
    
    float m, n, i;
    float x, prod=1.0;

    printf("digite o limite inferior(m): ");
    scanf("%f", &m);
    printf("Digite o limite superior(n): ");
    scanf("%f", &n);

    for(i = m ; i <= n ; i++){
        x = i + 1/i;

        prod *= x;
    }
    
    printf("o valor do produtorio é: %0.1f\n", prod);
    
    return 0;
}