package Classes;

public class Stack<T> {
    private Node<T> top;
    private int height;

    public Stack() {
        top = null;
        height = 0;
    }

    public Stack(T valor) {
        Node<T> newNode = new Node<T>(valor);
        top = newNode;
        height = 1;
    }

    public void push(T valor) {
        Node<T> newNode = new Node<T>(valor);
        newNode.proximo = top;
        top = newNode;
        height++;
    }

    public T pop() {
        if (height == 0) {
            throw new RuntimeException("pilha esta vazia");
        }
        Node<T> noAuxiliar = top;
        top = top.proximo;
        T value = noAuxiliar.valor;
        noAuxiliar.proximo = null;
        height--;

        return value;
    }

    public T peek() {
        if (top == null) {
            throw new RuntimeException("Pilha está vazia!");
        }
        return top.valor;
    }

    public void printStack() {
        System.out.println("Topo:");
        Node<T> noAuxiliar = top;
        while (noAuxiliar != null) {
            System.out.println("[" + noAuxiliar.valor + "]");
            noAuxiliar = noAuxiliar.proximo;
        }
        System.out.println();
    }

}