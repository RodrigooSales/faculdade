import hash.HashTable;

public class Main {
    public static void main(String[] args) throws Exception {
        HashTable hashTable = new HashTable();

        hashTable.insert("Oregano", 10);
        hashTable.insert("Gorgonzola", 101);
        hashTable.insert("Mussarela", 145);
        hashTable.insert("Pepperoni", 195);
        hashTable.insert("Bacon", 120);
        hashTable.insert("Mil Folhas", 180);
        hashTable.printTable();
        System.out.println("==================================================");
        System.out.println("Removendo: "+hashTable.remove("Gorgonzola"));
        hashTable.printTable();
    }
}
