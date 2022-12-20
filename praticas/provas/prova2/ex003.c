// Escreva uma função em C que receba uma string, um caracter c e o ponteiro para um buffer. o buffer deve conter a string recebida a partir
// da primeira ocorrencia de c. A função tambem deve retornar a quantidade de caracteres validos no buffer.
<<<<<<< HEAD

=======
>>>>>>> 670b63ac06f068f87f5403d44752f1e6000e3331
int countStringAt(char *text, char c, char *buffer){
    int i=0, countAt, textLenght = 0;

    while(*(text + i) != "\0"){
        textLenght++;
    }

    countAt = 0;
    while(*(text + i) != c && =< textLenght){
        countAt++;
        i++;
    }

    for(i=0 ; i<countAt ; i++){
        *(buffer + i) = *(text + i);
    }

    return countAt;
<<<<<<< HEAD
}
=======
}
>>>>>>> 670b63ac06f068f87f5403d44752f1e6000e3331
