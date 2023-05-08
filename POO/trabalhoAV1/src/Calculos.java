public class Calculos {

    //metodo classico para o calculo do fatorial
    public static int calculaFatorial(int numero){
        int resultado = 1;
        if(numero == 0){
            return resultado = 1;
        }
        else{
            for(int i = 2 ; i<= numero ; i++){
                resultado *= i;
            }
            return resultado;
        }
    }

    //metodo que calcula a soma de um numero até o teto definido pelo usario
    public static int calculaSoma(int base, int teto){
        int soma = 0;
        for(int i=base ; i<=teto ; i++){
            soma += i;
        }
        return soma;
    }

    //metodo para a manipulação de um numero onde se ele for par ele divide-o por 2 e se for impar ele o multiplica por 3 e soma 1
    public static int gerarNumero(int numero){
        int resultado = 0;
        if(numero % 2 == 0 && numero > 0){
            resultado = numero / 2;
        } else if (numero % 2 != 0 && numero > 0) {
            resultado = (3 * numero) + 1;
        }

        return resultado;
    }

}
