#include <stdio.h>
#include <math.h>


int main(void){
    int num1, num2, sum1, sum2;
    for (num1 = 0; num1 <= 100; num1++) {      
        if (num1 % 3 == 0){
            sum1 = sum1 + num1;
        } 
    }
    printf("somatorio dos divisiveis por 3: %d", sum1);

    for(num2 = 101 ; num2 <= 200 ; num2++){
        if(num2 % 5 == 0){
            sum2 = sum2 + num2;
        }
    }
    printf("somatorio dos divisiveis por 5: %d", sum2);
    return 0;
}