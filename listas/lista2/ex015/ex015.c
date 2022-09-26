// Elaborar um programa que apresente os resultados das potências do valor de base 3, elevado a um
// expoente que varie do valor 0 a 7.

#include <stdio.h>
#include <math.h>


int main(void){
    int i; double p;
    for(i = 0 ; i <= 7 ; i ++){
        p = pow(3, i);
        printf("3 ^ %d = %0.2f\n", i, p);
    }

    return 0;
}