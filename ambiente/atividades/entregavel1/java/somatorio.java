public class Somatorio {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // altere os valores do array para calcular o somatório de outros números
        int soma = 0;
        for(int i=0;i<numeros.length;i++){
            soma += numeros[i];
        }
        System.out.println("Somatório: " + soma);
    }
}
