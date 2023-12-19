import java.util.*;

class Node {
    Node next;
    int value;

    Node(int value) {
        this.value = value;
    }
}

class HashTable {
    Node start, end;
}

public class Main {
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTable[] hashTable = new HashTable[MAX];

        int n = scanner.nextInt();

        for (int j = 0; j < n; j++) {
            int key = scanner.nextInt();
            int num = scanner.nextInt();

            initialize(hashTable, key);

            for (int i = 0; i < num; i++) {
                int e = scanner.nextInt();
                insert(hashTable, e % key, e);
            }

            for (int i = 0; i < key; i++) {
                printHash(hashTable[i].start, i);
            }

            if (j + 1 < n) {
                System.out.println();
            }
        }
    }

    static void printHash(Node start, int index) {
        Node aux = start;
        System.out.print(index + " -> ");
        while (aux != null) {
            System.out.print(aux.value + " -> ");
            aux = aux.next;
        }
        System.out.println("\\");
    }

    static void insert(HashTable[] hashTable, int index, int e) {
        Node aux = new Node(e);
        if (hashTable[index].start == null) {
            hashTable[index].start = aux;
        } else {
            hashTable[index].end.next = aux;
        }
        hashTable[index].end = aux;
    }

    static void initialize(HashTable[] hashTable, int n) {
        for (int i = 0; i < n; i++) {
            hashTable[i] = new HashTable();
        }
    }
}