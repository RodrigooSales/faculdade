import java.util.ArrayList;

import ListasEncadeadas.ListaEncadeadaSimples;

public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeadaSimples lista = new ListaEncadeadaSimples(3);
        lista.inserirFim(8);
        lista.inserirFim(2);
        lista.inserirFim(1);
        lista.inserirFim(5);
        lista.exibirLista();

        lista.removerPosicao(5);
        lista.exibirLista();
    }
}
