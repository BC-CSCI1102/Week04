// file: StringStackC.java
// author: Bob Muller
//
// An implementation of a simple stack ADT.
//

import java.util.NoSuchElementException;

public class ObjectStackC implements ObjectStack {

  // Concrete representation type

  private static final int CAPACITY = 1000;
  private int top;
  private Object[] theStack;

  public ObjectStackC() {
    this.top = 0;
    this.theStack = new Object[CAPACITY];
  }

  public void push(Object s) {
    if (this.top == CAPACITY)
      throw new RuntimeException("Stack Overflow");
    else
      this.theStack[this.top++] = s;
  }

  public Object pop() {
    if (this.top == 0)
      throw new NoSuchElementException("Stack Underflow");
    else {
      Object item = this.theStack[--this.top];
      this.theStack[this.top] = null;
      return item;
    }
  }

  public Object peek() {
    if (this.top == 0)
      throw new NoSuchElementException("Stack Underflow");
    else {
      Object item = this.theStack[this.top - 1];
      return item;
    }
  }

  public boolean isEmpty() {
    return this.top == 0;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (int i = this.top - 1; i >= 0; i--)
      sb.append(String.format("%s\n", this.theStack[i].toString()));

    return sb.toString();
  }

  public static void main(String[] args) {

    // Unit testing
    ObjectStack myStack = new ObjectStackC();

    myStack.push("Alice");
    myStack.push("Jose");
    myStack.push("Bob");
    myStack.push(23);

    while (!myStack.isEmpty()) {
      String item = (String) myStack.pop();
      System.out.format("%s\n", item);
    }
  }
}

