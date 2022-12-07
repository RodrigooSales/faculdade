all: prog.e

prog.e: main.o utilData.o
	gcc -o prog.e main.o utilData.o

main.o: main.c
	gcc -o main.o -c main.c

util.o: util.c 
	gcc -o utilData.o -c utilData.c

clean:
	rm -f *.o prog.e
	