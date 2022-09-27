#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void occupy(unsigned char cabinets, int choice) {
  do {
    choice = (char)pow(2, rand() % 8);
    if (cabinets & choice) {
      choice = 10;
    } else {
      cabinets = cabinets | choice;
    }
  } while (choice == 10);
  choice = 1;
}

void release(unsigned char cabinets, int choice) {
  printf("Cabinet number(0/7): ");
  scanf("%d", &choice);
  choice = (char)pow(2, choice);

  if (cabinets & choice) {
    cabinets = cabinets & ~choice;
  } else {
    printf("the locker has been successfully released!\n");
  }
  choice = 2;
}

int main(void) {
  srand(time(NULL));
  unsigned char cabinets = 0;
  int choice;

  do {
    printf("Cabinets Situation:\n");
    printf("7 6 5 4 3 2 1 0 \n");

    for (unsigned char i = 128; i >= 1; i = i / 2) {
      if (cabinets & i) {
        printf("1 ");
      } else {
        printf("0 ");
      }
    }

    printf("\n--------- Menu Display ---------\n");
    printf("1. Occupy cabinets\n");
    printf("2. Release cabinets\n");
    printf("3. Exit\n");

    do {
      printf("choice: ");
      scanf("%d", &choice);
      getchar();
    } while (choice < 1 || 3 < choice);

    switch (choice) {
    case 1:
      if (cabinets == 255) {
        printf("All lockers are occupied!");
        break;
      }
      occupy(cabinets, choice);
      break;
    case 2:
      release(cabinets, choice);
      break;
    }
  } while (choice != 3);

  printf("THE END\n");
  return 0;
}
