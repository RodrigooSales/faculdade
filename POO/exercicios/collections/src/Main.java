import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gerando array");
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for(int i=0 ; i<100 ; i++){
            Random gerador = new Random();
            lista.add(gerador.nextInt(100));
        }

        for(int i=0 ; i<100 ; i++){
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(lista.size());
    }
}