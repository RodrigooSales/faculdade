#include "utilData.h"

void imprimir(struct disciplina dados){
	printf("Dados colinhidos: \n");
  	printf("\tNome da Disciplina: %s\n", dados.nomeDisciplina);
  	printf("\tId da Disciplina: %d\n", dados.id);
  	printf("\tNome do Professor: %s\n", dados.data.nomeProfessor);
  	printf("\tMatricula do Professor: %d\n", dados.data.matricula);
}