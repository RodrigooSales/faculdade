// A série de Fibonacci  ́e formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55... etc. Escreva
// um algoritmo que gere a série de Fibonacci até o vigésimo termo.

#include <stdio.h>

int main(void) {
    printf("-------- Serie Fibonacci --------\n");
    int n = 1, fib = 0, aux = 0;


    while(fib <1000) { 
        printf("%d-", fib);
        fib = fib + aux;
        aux = n;
        n = fib;
    }
  return 0;
}