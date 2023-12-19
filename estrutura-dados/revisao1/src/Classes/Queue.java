package Classes;

public class Queue<T> {
    private Node<T> inicio;
    private Node<T> fim;
    private int lenght;

    public Queue() {
        inicio = null;
        fim = null;
        lenght = 0;
    }

    public Queue(T valor) {
        Node<T> newNode = new Node<T>(valor);
        inicio = newNode;
        fim = newNode;
        lenght = 1;
    }

    // metodo que adciona um elemento no final da fila
    public void enqueue(T valor) {
        Node<T> newNode = new Node<T>(valor);
        if (inicio == null) {
            inicio = newNode;
            fim = newNode;
        } else {
            fim.proximo = newNode;
            fim = newNode;
        }
        lenght++;
    }

    // metodo que retira o primeiro elemento da fila
    public void dequeue() {
        if (inicio == null) {
            throw new RuntimeException("A fila está vazia");
        }
        Node<T> aux = inicio;
        if (lenght == 1) {
            inicio = null;
            fim = null;
        } else {
            
            inicio = inicio.proximo;
            aux = null;
            lenght--;
        }
    }

    public void printQueue(){
        Node<T> auxNode = inicio;
        while(auxNode!=null){
            System.out.print(auxNode.valor+" ");
            auxNode = auxNode.proximo;
        }
        System.out.println();

    }
}
