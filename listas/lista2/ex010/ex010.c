// Elabore um programa que apresente os quadrados dos números inteiros múltiplos de 4 existentes na
// faixa de valores de 15 a 90.

#include <stdio.h>

int main(void) {
  int i;
  for (i = 4; (i * 4) >= 15 && (i * 4) <= 90; i++) {
    printf("%d\n", 4 * i);
  }
}