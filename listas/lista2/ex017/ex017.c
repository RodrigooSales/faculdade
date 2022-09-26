// Elaborar um programa que apresente os valores de conversão de graus Celsius em graus Fahrenheit,
// de 10 em 10 graus, iniciando a contagem em dez graus Celsius e finalizando em cem graus Celsius. O
// programa deve apresentar os valores das duas temperaturas. Obs.: Pesquise a fórmula de conversão.

#include <stdio.h>

int main(void){
    float C, F;
    for(C = 10 ; C <= 100 ; C =C + 10){
        F = 1.8*C + 32;
        printf("A temperatura %0.2f°C em °F é de %0.2f°F ", C, F);
    }
}