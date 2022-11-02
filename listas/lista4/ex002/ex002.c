// 2. Escreva um programa que troque o valor de dois números utilizando ponteiros.

#include <stdio.h>

int main(void) {
  int x,y;
  int ptr;

  printf("Digite o valor do primeiro numero: ");
  scanf("%d", &x);
  printf("Digite o valor do segundo numero: ");
  scanf("%d", &y);

  ptr = x;
  x = y;
  y = ptr;

  printf("x = %d\n", x);
  printf("y = %d", y);

  
  return 0;
}