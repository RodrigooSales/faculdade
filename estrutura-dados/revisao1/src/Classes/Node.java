package Classes;

class Node<T> {
    T valor;
    Node<T> proximo;

    public Node(T valor) {
        this.valor = valor;
        proximo = null;
    }
}