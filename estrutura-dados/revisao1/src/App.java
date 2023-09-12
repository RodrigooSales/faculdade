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
    }
}
