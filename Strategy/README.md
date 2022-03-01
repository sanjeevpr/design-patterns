# Strategy Pattern
## What?
It is a behavioural design pattern that lets us define a family of algorithms, put those in the separate classes and make their object interchangable.

## Type
Behavioural

## When?
When we have a class which is does a multiple different things (algorithms or strategies) which are very similar to each other. Probably those things the class does are called based on conditional statements. Also, the algorithms changes a quite lot. A strategy doesn't know anything about the presence of other strategies. They are indepedent of each other.

## Why?
Let's suppose you need to make a slight change in one of the algorithm's implementation. This will result in change of the whole class which might be very risky because each change can bring about potential bugs in an stable system.

## How?
The idea follows the general design principle of separating what changes and what remains unchanged. We can extract the algorithms or strategies out of the class to separate classes. The class (context) can be changed to an interface and the strategy classes can implement the method which actually has the logic. The clients can have an instance field of the context and based on the requirement can pass in the context's subclass object and run any one of the algorithm.

![Strategy Design Pattern Example](https://github.com/sanjeevpr/design-patterns/blob/main/Resouces/strategy.png)

## Resources
- https://refactoring.guru/design-patterns/strategy
- Head First Design Patterns
