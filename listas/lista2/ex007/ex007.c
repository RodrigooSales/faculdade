// Para que a divisão entre 2 números possa ser realizada, o divisor não pode ser nulo (zero). Escreva
// um programa para ler 2 valores e imprimir o resultado da divisão do primeiro pelo segundo. OBS: O
// programa deve validar a leitura do segundo valor (que não deve ser nulo). Enquanto for fornecido um
// valor nulo a leitura deve ser repetida.

#include <stdio.h>

int main(void) {
  float num1;
  float num2;

  printf("Digite o valor do primeiro numero: ");
  scanf("%f", &num1);

  printf("Digite o valor do segundo numero: ");
  scanf("%f",&num2);
  
  while(num2 == 0){
    printf("Digite outro valor para o segundo numero: ");
    scanf("%f",&num2);
  }
  printf("O valor da divisão é de: %0.1f\n", num1/num2);
}