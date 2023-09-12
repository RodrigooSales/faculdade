package Classes;

public class Queue<T> {
    private Node<T> inicio;
    private Node<T> fim;
    private int lenght;

    public Queue() {
        lenght = 0;
        inicio = null;
        fim = null;
    }

    public Queue(T valor) {
        Node<T> novoNo = new Node<T>(valor);
        inicio = novoNo;
        fim = novoNo;
        lenght = 1;
    }
}
