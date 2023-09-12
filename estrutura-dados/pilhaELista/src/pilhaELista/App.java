package pilhaELista;

import java.lang.StackWalker.StackFrame;

public class App {
	public static void main(String[] args) throws Exception {
		StaticStack<Integer> pilha = new StaticStack<Integer>(10);
		StaticQueue<Integer> fila = new StaticQueue<Integer>(10);


		
	}
}

// parte da pilha
class StaticStack<T> implements Stack<T> {
	private T[] stack;
	private int numberOfElements;

	public StaticStack(int initialSize) {
		stack = (T[]) new Object[initialSize];
		numberOfElements = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return numberOfElements == 0;
	}

	@Override
	public void push(T value) throws FullDataStructureException {
		// TODO Auto-generated method stub
		if (numberOfElements == stack.length) {
			throw new FullDataStructureException("A pilha está cheia!");
		}
		stack[numberOfElements] = value;
		numberOfElements++;
	}

	@Override
	public T pop() throws EmptyDataStructureException {
		if (isEmpty()) {
			throw new EmptyDataStructureException("A pilha está vazia");
		}

		T elementoRemovido = stack[numberOfElements];
		stack[numberOfElements] = null;
		numberOfElements--;

		return elementoRemovido;
	}

	@Override
	public T peek() throws EmptyDataStructureException {
		if (isEmpty()) {
            throw new EmptyDataStructureException("A pilha está vazia");
        }

        return stack[numberOfElements];
	}

	@Override
	public void showElements() throws EmptyDataStructureException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new EmptyDataStructureException("A pilha está vazia!");
		}
		System.out.print("[");
		for (int i = 0; i < numberOfElements; i++) {
			if (i != numberOfElements - 1) {
				System.out.print(stack[i] + ", ");
			} else {
				System.out.println(stack[i] + "]");
			}
		}
	}
}

// Parte da fila

class StaticQueue<T> implements Queue<T> {
	private T[] queue;
	private int numberOfElements;
	private int inicio;
	private int fim;
	

	public StaticQueue(int initialSize) {
		queue = (T[]) new Object[initialSize];
		numberOfElements = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numberOfElements == 0;
	}

	@Override
	public void enqueue(T value) throws FullDataStructureException {
		// TODO Auto-generated method stub
		if (numberOfElements == queue.length) {
			throw new FullDataStructureException("A fila está cheia!");
		}
		queue[numberOfElements] = value;
		numberOfElements++;
		
	}

	@Override
	public T dequeue() throws EmptyDataStructureException {
		if (isEmpty()) {
            throw new EmptyDataStructureException("A fila está vazia");
        }
		
		T elementoRemovido = queue[inicio];
        inicio = (inicio + 1) % numberOfElements;
        numberOfElements--;
		
		return elementoRemovido;
	}

	@Override
	public T first() throws EmptyDataStructureException {
		if(isEmpty()) {
			throw new EmptyDataStructureException("A fila está vazia");
		}
		return null;
	}

	@Override
	public void showElements() throws EmptyDataStructureException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new EmptyDataStructureException("A fila está vazia!");
		}
		System.out.print("[");
		for (int i = 0; i < numberOfElements; i++) {
			if (i != numberOfElements - 1) {
				System.out.print(queue[i] + ", ");
			} else {
				System.out.println(queue[i] + "]");
			}
		}
	}

}

interface Stack<T> {
	public int size();

	public boolean isEmpty();

	public void push(T value) throws FullDataStructureException;

	public T pop() throws EmptyDataStructureException;

	public T peek() throws EmptyDataStructureException;

	public void showElements() throws EmptyDataStructureException;
}

interface Queue<T> {
	public int size();

	public boolean isEmpty();

	public void enqueue(T value) throws FullDataStructureException;

	public T dequeue() throws EmptyDataStructureException;

	public T first() throws EmptyDataStructureException;

	public void showElements() throws EmptyDataStructureException;

}

class EmptyDataStructureException extends RuntimeException {
	public EmptyDataStructureException(String message) {
		super(message);
	}
}

class FullDataStructureException extends RuntimeException {
	public FullDataStructureException(String message) {
		super(message);
	}
}