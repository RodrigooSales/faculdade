// 1. Escreva um programa que adicione dois números usando ponteiros. Além do valor da soma, imprima
// também o endereço de memória onde o valor resultante dessa soma está armazenado.

#include <stdio.h>

int main(void) {
  int x, y, soma;
  int *px, *py;

  printf("Digite o valor do primeiro numero: ");
  scanf("%d", &x);
  printf("Digite o valor do segundo numero : ");
  scanf("%d", &y);
  
  px = &x;
  py = &y;

  soma = *px + *py;
  printf("O valor da soma é: %d\n", soma);
  printf("O endereço do primeiro numero é: %p\n", &px);
  printf("O endereço do segundo numero é: %p", &py);
  return 0;
}