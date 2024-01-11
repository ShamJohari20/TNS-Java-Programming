## Java Lambda Expressions

- It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library. It helps to iterate, filter and extract data from collection.

- The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

- A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.


## Functional Interface
- Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface. Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.

## zero Parameter

- () -> System.out.println("Zero parameter lambda");


## one parameter 

- (p) -> System.out.println("One parameter: " + p);


## multple parameter 

- (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);


## lambda function with Return type
- Same as normal return type of function 
