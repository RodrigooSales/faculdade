public class Contagem {
    public static void main(String[] args) {
        int n = 10; // altere o valor de n para contar quantos valores inteiros existem entre 1 e n
        int[] numeros = {2, 4, 6, 7, 9, 11, 13, 14, 15, 18}; // altere os valores do array para contar quantos valores inteiros existem entre o primeiro dado e n
        int count = 0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i] >= 1 && numeros[i] <= n){
                count++;
            }
        }
        System.out.println("Quantidade de valores inteiros: " + count);
    }
}
