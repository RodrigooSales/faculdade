package hash;
import java.nio.file.NotDirectoryException;

import hash.Node;

public class HashTable {
  private Node[] hashTable;
  private int size;
  public HashTable(){
    size = 7;
    hashTable = new Node[size];
  }

  private int hash(String key){
    int hash = 0;
    for(int i=0; i<key.length(); i++){
      hash = hash + key.charAt(i)*31;
    }
    
    return hash%size;
  }

  public void insert(String key, int value){
    int hash = hash(key);
    Node newNode = new Node(key, value);
    if(hashTable[hash]==null){
      hashTable[hash] = newNode;
    } else {
      Node auxNode = hashTable[hash];
      while (auxNode.next != null && !key.equals(auxNode.key)) {
        auxNode = auxNode.next;
      }
      if(key.equals(auxNode.key)){
        auxNode.value = value;
      } else{
        auxNode.next = newNode;
        newNode.prev = auxNode;
      }
    }
  }

  public Integer getValue(String key){
    return null;
  }

  public Integer remove(String key){
    int hash = hash(key);
    if(hashTable[hash] == null){
      return null;
    }

    Node auxNode = hashTable[hash];
    while (auxNode.next!=null && !key.equals(auxNode.key)) {
      auxNode = auxNode.next;
    }
    if(!key.equals(auxNode.key)){
      return null;
    } else{
      if(auxNode == hashTable[hash]){
        if(auxNode.next!=null){
          hashTable[hash] = null;
        }
      } else if(auxNode.next == null && auxNode.prev!=null){
        auxNode.prev.next = null;
        auxNode.prev = null;
      } else{
        auxNode.prev.next = auxNode.next;
        auxNode.next.prev = auxNode.prev;
        auxNode.next = null;
        auxNode.prev = null;
      }
      return auxNode.value;
    }
  }

  public String[] getKeys(){
    String keys = "";
    for(int i = 0 ; i < hashTable.length ; i++){
      Node auxNode = hashTable[i];
      while (auxNode!=null) {
        keys += auxNode.key+",";
        auxNode = auxNode.next;
      }
    }
    return keys.split(",");
  }

  public void printTable(){
    for(int i = 0 ; i < hashTable.length ; i++){
      Node auxNode = hashTable[i];
      System.out.println(i+ ":");
      while (auxNode != null) {
        System.out.println("  {"+auxNode.key+"= "+auxNode.value+"}");
        auxNode = auxNode.next;
      }
    }
  }
}
