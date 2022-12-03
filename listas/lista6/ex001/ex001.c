// 1. Escreva um programa em C que utilize uma Estrutura aluno para conter duas notas, lidas do
// usuário, e sua média.

#include <stdio.h>

struct alunos{
  float nota1;
  float nota2;
};

int main(void) {
  struct alunos aluno;

  printf("Digite a primeira nota do aluno: ");
  scanf("%f", &aluno.nota1);

  printf("Digite a segunda nota do aluno: ");
  scanf("%f", &aluno.nota2);

  float media = (aluno.nota1+aluno.nota2)/2;

  printf("A media do aluno é: %0.2f", media);
}