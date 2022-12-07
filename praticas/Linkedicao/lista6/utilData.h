#include <stdio.h>

struct professor {
  char *nomeProfessor;
  int matricula;
};

struct disciplina {
  char *nomeDisciplina;
  int id;
  struct professor data;
};

void imprimir(struct disciplina);