// file: ObjectStack.java
// author: Bob Muller
//
// An API for simple stacks of Objects.
//
public interface ObjectStack {

  void push(Object s);

  Object pop();

  Object peek();

  boolean isEmpty();

  String toString();
}


