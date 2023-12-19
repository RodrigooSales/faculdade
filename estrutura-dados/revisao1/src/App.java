import Classes.Queue;
import Classes.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exibindo a pilha...");
        Stack stack = new Stack(3);
        stack.push(6);
        stack.push(9);
        stack.push(42);
        stack.push(1);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.peek();


        System.out.println("Exibindo a fila...");
        Queue queue = new Queue(3);
        queue.enqueue(12);
        queue.enqueue(24);
        queue.enqueue(47);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }
}
