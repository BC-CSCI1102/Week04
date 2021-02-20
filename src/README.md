# CSCI 1102 Computer Science 2

### Spring 2021

------

The `inheritance/` directory has an example taken from Bloch's Effective Java, i.e., an `InstrumentedHashSet` class, showing why the combination of inheritance and overriding can lead to non-modular code. We will avoid the use of inheritance in this class.

The `stacks/` directory has several implementations of the Stack ADT.

+ `stacks/string/` has a simple implementation of stacks that hold only Strings.
+ `stacks/object/` has an implementation of a Stack ADT that uses the `Object` class to introduce polymorphism -- the stacks can hold any reference type. However, detection of improper use of the stack is delayed until run-time.
+ `stacks/modern/` has both sequential and linked implementations of a polymorphic Stack ADT using generic type variables.