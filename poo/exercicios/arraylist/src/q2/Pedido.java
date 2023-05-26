package q2;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private int numPedido;
    private Map<String, Integer> itens = new HashMap<String, Integer>();
    private double valorTotal = 0.0;

    public Pedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public void addItem(String nome, int quantidade, double valor) {
        itens.put(nome, quantidade);
        valorTotal += quantidade * valor;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
