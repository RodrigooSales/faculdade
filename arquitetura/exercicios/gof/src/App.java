public class App {
    public static void main(String[] args) throws Exception {
        Logger log1 = Logger.obterInstancia();
        log1.setAtivo(true);
        log1.log("PRIMEIRA MENSAGEM DE LOG");

        Logger log2 = Logger.obterInstancia();
        log2.log("SEGUNDA MENSAGEM DE LOG");
    }
}
