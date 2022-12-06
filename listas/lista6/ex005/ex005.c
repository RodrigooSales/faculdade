// 5. Crie uma Estrutura disciplina em que um dos campos corresponde também a
// uma estrutura professor.

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct professor {
  char *nomeProfessor;
  int matricula;
};

struct disciplina {
  char *nomeDisciplina;
  int id;
  struct professor data;
} dados;

int main(void) {
  dados.data.nomeProfessor = malloc(1 * sizeof(char));
  dados.nomeDisciplina = malloc(1 * sizeof(char));
  srand(time(NULL));
  dados.id = rand() % 100000000000;

  printf("Digite o nome da disciplina: ");
  scanf("%s", dados.nomeDisciplina);
  printf("Digite o nome do professor que administra a disciplina: ");
  scanf("%s", dados.data.nomeProfessor);
  printf("Digite a matricula do professor: ");
  scanf("%d", &dados.data.matricula);

  printf("Dados colinhidos: \n");
  printf("\tNome da Disciplina: %s\n", dados.nomeDisciplina);
  printf("\tId da Disciplina: %d\n", dados.id);
  printf("\tNome do Professor: %s\n", dados.data.nomeProfessor);
  printf("\tMatricula do Professor: %d\n", dados.data.matricula);
  return 0;
}
