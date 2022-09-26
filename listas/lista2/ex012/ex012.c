// Elaborar um programa que mostre os resultados da tabuada de um número inteiro qualquer, a qual
// deve ser apresentada de acordo com sua forma tradicional.

#include <stdio.h>

int main(void) {
  printf("------------ Tabuada ------------\n");
  int n, count;
  printf("Digite um numero para ver sua tabuada: ");
  scanf("%d", &n);

  for(count = 1 ; count <= 10 ; count++){
    printf("%d x %d = %d\n", n, count, n * count);
  }
  
  
  return 0;
}