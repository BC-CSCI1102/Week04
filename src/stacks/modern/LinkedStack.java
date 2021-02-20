import java.util.NoSuchElementException;

public class LinkedStack<T> implements Stack<T> {

  // Concrete representation
  private int n;
  private Node top;

  private class Node {
    T info;
    Node next;

    private Node(T info, Node next) {
      this.info = info;
      this.next = next;
    }
  }

  public LinkedStack() {
    this.n = 0;
    this.top = null;
  }

  public void push(T s) {
    this.top = new Node(s, this.top);
    this.n++;
  }

  public T pop() {
    if (this.isEmpty())
      throw new NoSuchElementException("Stack Underflow");
    T item = this.top.info;
    this.top = this.top.next;
    this.n--;
    return item;
  }

  public T peek() {
    if (this.isEmpty())
      throw new NoSuchElementException("Stack Underflow");
    return this.top.info;
  }

  public boolean isEmpty() {
    return this.n == 0;
  }

  public int size() {
    return this.n;
  }

  public String toString() {
    return "No";
  }
  

}
/*
  private Node top;
  private int n;

  // The Node class is recursive.
  private class Node {
    T info;
    Node next;

    private Node(T info, Node next) {
      this.info = info;
      this.next = next;
    }
  }

  public LinkedStack() {
    this.top = null;
    this.n = 0;
  }

  public boolean isEmpty() {
    return this.n == 0;
  }

  public int size() {
    return this.n;
  }

  public void push(T item) {
    this.top = new Node(item, this.top);
    this.n++;
  }

  public T pop() {
    if (this.isEmpty())
      throw new NoSuchElementException("pop: Stack Underflow");

    T item = this.top.info;
    this.n--;
    this.top = this.top.next;
    return item;
  }

  public T peek() {
    return this.top.info;
  }

  public String toString() {

    StringBuilder sb = new StringBuilder();
    Node current = top;
    while (current != null) {
      sb.append(current.info + " ");
      current = current.next;
    }
    return sb.toString();
  }

  public static void main(String[] args) {

    Stack<Integer> is = new LinkedStack<Integer>();

    is.push(343);
    is.push(686);
    System.out.format("stack = %s\n", is.toString());
  }
}

 */
