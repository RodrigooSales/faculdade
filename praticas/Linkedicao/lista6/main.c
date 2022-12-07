#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "utilData.h"

int main(void){
    struct disciplina dados;
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

    imprimir(dados);
}