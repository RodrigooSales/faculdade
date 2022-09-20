// Uma loja vende seus produtos no sistema entrada mais duas prestações, sendo a entrada maior do que
// ou igual às duas prestações; estas devem ser iguais, inteiras e as maiores possíveis. Por exemplo, se o
// valor da mercadoria for R$270,00, a entrada e as duas prestações são iguais a R$90,00; se o valor da
// mercadoria for R$302,75, a entrada é de R$102,75 e as duas prestações são iguais a R$100,00. Escreva
// um programa que receba o valor da mercadoria e forneça o valor da entrada e das duas prestações, de
// acordo com as regras acima.

#include<stdio.h>

#include<stdlib.h>

int main( ){

int Prest1, Prest2;

float ValorM, ValorEnt;

printf (" Informe o Valor da Mercadoria: ");

scanf (" %f", &ValorM);

Prest1 = ValorM / 3;

Prest2 = Prest1;

ValorEnt = ValorM - (Prest1 + Prest2);

printf ("Valor de entrada: %.2f\n Valor da primeira prestação: %d\n Valor da segunda prestação: %d\n", ValorEnt, Prest1, Prest2);

return 0;

}