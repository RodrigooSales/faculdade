all: prog.e
	
prog.e: main.o function.o
	gcc -o prog.e main.o function.o

main.o: main.c
	gcc -o main.o -c main.c

function.o: function.c
	gcc -o function.o -c function.c
	