import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("João");
        try {
            pessoa.setIdade(-15);
        } catch (IdadeNegativaException e) {
            throw new RuntimeException(e);
        }
        System.out.println(pessoa);
    }
}