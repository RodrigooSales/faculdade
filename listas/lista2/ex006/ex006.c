#include <stdio.h>

int main(void) {
  printf("-------- PROGRAMA INICIADO --------\n");

  int lula = 0;
  int bolsonaro = 0;
  int ciro = 0;
  int simone = 0;
  int davila = 0;
  int soraya = 0;
  int brancos = 0;
  int voto;
  printf("Digite o numero do candidato: ");
  scanf("%d", &voto);

  do{
    printf("Digite o numero do candidato: ");
    scanf("%d", &voto);
    if (voto == 0){
      brancos++;
    } else if (voto == 13){
      lula++;
    } else if (voto == 22){
      bolsonaro++;
    } else if (voto == 12){
      ciro++;
    } else if (voto == 15){
      simone++;
    } else if (voto == 44){
      soraya++;
    } else if (voto == 30){
      davila++;
    } else if (voto <= 0){
        printf("O resultado foi:\n ciro - %d\n lula - %d\n bolsonaro - %d\n Simone Tebet - %d\n Davila - %d\n Soraya - %d\n", ciro, lula, bolsonaro, simone, davila, soraya);
        break;
    }
    
  }while(voto != 0);
  return 0;
}