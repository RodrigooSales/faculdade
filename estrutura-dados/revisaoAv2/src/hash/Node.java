package hash;

public class Node {
  public String key;
  public int value;
  public Node next;
  public Node prev;

  public Node(String key, int value){
    this.key = key;
    this.value = value;
  }
}
