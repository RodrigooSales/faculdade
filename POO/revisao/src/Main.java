public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(10);
        System.out.println(pessoa.getIdade());
        pessoa.fazerAniversario();
        System.out.println(pessoa.getIdade());
    }
}