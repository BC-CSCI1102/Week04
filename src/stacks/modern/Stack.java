// file: Stack.java
// author: Bob Muller
//
// An API for simple generic stacks.
//
public interface Stack<T> {

  void push(T s);

  T pop();

  T peek();

  boolean isEmpty();

  int size();

  String toString();
}







