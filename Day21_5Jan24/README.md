## Wildcard in Java Generics
- The ? (question mark) symbol represents the wildcard element. It means any type. If we write <? extends Number>, it means any child class of Number, e.g., Integer, Float, and double. Now we can call the method of Number class through any child class object.

## Unbounded Wildcards
- The unbounded wildcard type represents the list of an unknown type such as List<?>. 

## Upper Bounded Wildcards
- The purpose of upper bounded wildcards is to decrease the restrictions on a variable. It restricts the unknown type to be a specific type or a subtype of that type. It is used by declaring wildcard character ("?") followed by the extends (in case of, class) or implements (in case of, interface) keyword, followed by its upper bound.

## Lower Bounded Wildcards
- The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a supertype of that type. It is used by declaring wildcard character ("?") followed by the super keyword, followed by its lower bound.

## HW

- Write a generic method to count the number of elements in a collection that have a specific property (e.g., odd integers, prime numbers, palindromes).

- Write a generic method to exchange the positions of two different elements in an array.

- Write a generic method to find the maximal element in the range [begin, end] of a list.
