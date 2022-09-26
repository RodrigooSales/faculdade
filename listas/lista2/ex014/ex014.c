// Elabore um programa que apresente a quantidade de números divisíveis por 3 pertencentes a faixa
// A,B especificada pelo usuário. O programa deve funcionar tanto para A > B quanto para B > A.

#include <stdio.h>

int main(void) {
  int A, B, i = 0;
  printf("Digite o valor do inicio do intervalo(A): ");
  scanf("%d", &A);

  printf("Digite o valor do fim do intevalo(B): ");
  scanf("%d", &B);

  if(A <= B){
    for(i = A ; i <= B ; i++){
      if(i % 3 == 0){
        printf("O numero %d é divisivel por 3\n", i);
      }
    }
  } else if(B <= A){
    for(i = B ; i <= A ; i++){
      if(i % 3 == 0){
        printf("O numero %d é divisivel por 3\n", i);
      }
    }
  }
}