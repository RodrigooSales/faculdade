public class Mdc {
    public static void main(String[] args) {
        int a = 15, b = 10; // altere os valores de a e b para calcular o MDC de outros números
        int mdc = calcularMdc(a, b);
        System.out.println("MDC(" + a + ", " + b + ") = " + mdc);
    }

    public static int calcularMdc(int a, int b) {
        if(b == 0){
            return a;
        } else {
            return calcularMdc(b, a % b);
        }
    }
}