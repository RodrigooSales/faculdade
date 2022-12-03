// 2. Escreva um programa em C que utilize uma Estrutura estoque que contém uma
// string com o nomePeca, um número inteiro para identificar o número da peça, o
// preço em ponto flutuante e um elemento inteiro para identificar o número do
// pedido.
#include <stdio.h>
#include <time.h>

struct Estoque {
  char name[100];
  int id;
  float price;
  int order;
};
int main(void) {
  struct Estoque buy;
  srand(time(NULL));

  buy.id = rand();

  puts("Digite o nome do produto");
  fgets(buy.name, 100, stdin);

  printf("Digite o preço do produto: ");
  scanf("%f", &buy.price);

  printf("Digite o numero do pedido: ");
  scanf("%d", &buy.order);

  printf("\n----------Dados em estoque após atualização---------- \n");

  printf("id: %d\n", buy.id);
  printf("name: %s", buy.name);
  printf("price: %.2f\n", buy.price);
  printf("order: %d\n", buy.order);

  return 0;
}