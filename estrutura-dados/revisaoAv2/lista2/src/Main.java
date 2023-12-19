import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            sc.nextLine();
          
            String[] entrada = sc.nextLine().split(" ");
            int M = Integer.parseInt(entrada[0]); 
            int C = Integer.parseInt(entrada[1]); 
            HashTable ht = new HashTable(M);
            for(int j = 0; j < C; j++){
                ht.insert(sc.nextInt());    
            }

            ht.printTable();
            

        }
    }

}               




class HashTable{

    class LinkedList{
        Node head;
        Node tail;
        int length;
        public LinkedList(){
            head = null;
            tail = null;
            length = 0;
        }

        public void append(int value){
            Node newNode = new Node(value);
            if(head==null){
                head = newNode;
            }else{
                tail.next = newNode;                
            }
            tail = newNode;
            length++;
        }

    }

    class Node{
        private int value;
        
        private Node next;
        private Node prev;
        public Node(int value) {
            this.value = value;
 
        }        
    }
    private LinkedList[] hashTable;
    private int size;
    public HashTable(int size) {        
        hashTable = new LinkedList[size];

        for(int i = 0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList();
        }


    }


    private int hash(int key){
                
        return key%hashTable.length;
    }

    public void insert(int key){
        int hash = hash(key);  
        hashTable[hash].append(key);

    }

 

   

    public void printTable(){
        StringBuilder saida = new StringBuilder();
        for(int i = 0; i < hashTable.length; i++){
            saida.append(i);
            saida.append(" -> ");
            // System.out.print(i+" -> ");
            Node auxNode = hashTable[i].head;
            while(auxNode!=null){
                saida.append(auxNode.value);
                saida.append(" -> ");
                auxNode = auxNode.next;
            }
            saida.append("\\\n");
            
        }
        System.out.print(saida);
    }

    
}