public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // altere o valor de n para obter uma sequência de tamanho diferente
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for(int i=2;i<n;i++){
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
