// Elabore um programa que calcule o somatório de todos os números pares pertencentes a faixa A,B
// especificada pelo usuário. O programa deve funcionar tanto para A > B quanto para B > A.
#include <stdio.h>

int main(void) {
  printf("----------Somatorio----------\n");
  int A, B, i = 0, sum = i;
  printf("Digite o valor do inicio do intervalo(A): ");
  scanf("%d", &A);

  printf("Digite o valor do fim do intevalo(B): ");
  scanf("%d", &B);

  if(A <= B){
    for(i = A ; i < B ; i++){
      if(i % 2 == 0){
        sum = sum + i;
      }
    }
  } else if(B <= A){
    for(i = B ; i < A ; i++){
      if(i % 2 == 0){
        sum = sum + i;
      }
    }
  }
  
  
  printf("O valor do somatorio dos pares de %d ate %d é %d\n", A, B, sum);
  return 0;
}