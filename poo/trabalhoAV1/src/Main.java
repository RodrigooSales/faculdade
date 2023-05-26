import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha uma das opções:" +
                "\n 1- Fatorial de um numero" +
                "\n 2- Calcular a soma de um numero até outro" +
                "\n 3- Gerar um novo numero" +
                "\n sua escolha: ");
        int escolha = sc.nextInt();

        if(escolha == 1){
            System.out.print("Digite o numero que será calculado o fatorial: ");
            int numero = sc.nextInt();
            int resultado = Calculos.calculaFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + resultado);
        } else if (escolha == 2) {
            System.out.println("Digite a base e o teto da sua soma:");
            System.out.print("Valor da base: ");
            int base = sc.nextInt();
            System.out.print("Valor do teto: ");
            int teto = sc.nextInt();

            int resultado = Calculos.calculaSoma(base, teto);
            System.out.println("Resultado da soma de: "+ base +" + "+teto+" = "+resultado);

        } else if (escolha == 3) {
            System.out.print("Digite o valor do numero para ser manipulado: ");
            int numero = sc.nextInt();
            int resultado = Calculos.gerarNumero(numero);

            System.out.println("Resultado da manipulação: " + resultado);
        }
    }
}