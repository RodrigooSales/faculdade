package Classes;

public class MyStack<T> {
    private Node<T> top;
    private int height;

    // create a method in java that add element in the top of stack
    public void push(T valor) {
        Node<T> newNode = new Node<T>(valor);
        newNode.proximo = top;
        top = newNode;
        height++;
    }
    
    // create a method in java that remove element and return value of this element in the top of stack
    public void pop(){
        if (height == 0) {
            throw new RuntimeException("pilha esta vazia");
        }
        Node<T> noAuxiliar = top;
        top = top.proximo;
        T value = noAuxiliar.valor;
        noAuxiliar.proximo = null;
        height--;
    }

    // crie um metodo que retorne o valor do elemento no topo da pilha
    public T peek(){
        if (top == null) {
            throw new RuntimeException("Pilha está vazia!");
        }
        return top.valor;
    }

    // crie um metodo que imprima todos os elementos da pilha
    public void printStack(){
        System.out.println("Topo:");
        Node<T> noAuxiliar = top;
        while (noAuxiliar != null) {
            System.out.println("[" + noAuxiliar.valor + "]");
            noAuxiliar = noAuxiliar.proximo;
        }
        System.out.println();
    }
}