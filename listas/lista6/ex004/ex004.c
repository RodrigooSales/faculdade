// 4. Escreva um programa em C que modifique a Questão 1 para conter um array com 3 alunos. Escreva
// uma função para calcular a média dos alunos.

#include <stdio.h>

struct alunos{
   float nota1;
   float nota2;
   float media;
};

float calcMedia(){
    
}

int main(void) {
  struct alunos alunos[QTD];

  printf("Digite a primeira nota do aluno: ");
  scanf("%f", &aluno.nota1);

  printf("Digite a segunda nota do aluno: ");
  scanf("%f", &aluno.nota2);

  float media = (aluno.nota1+aluno.nota2)/2;

  printf("A media do aluno é: %0.2f", media);
}