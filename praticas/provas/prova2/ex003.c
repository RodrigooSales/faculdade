// Escreva uma função em C que receba uma string, um caracter c e o ponteiro para um buffer. o buffer deve conter a string recebida a partir
// da primeira ocorrencia de c. A função tambem deve retornar a quantidade de caracteres validos no buffer.
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
}
