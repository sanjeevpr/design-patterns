# State Pattern
## What?
It is a behavioural design pattern that lets an object alter its behaviour when its internal state changes. This apprears as if the object has changed its class.

## Type
- Behavioural
- Based on composition

## When?
When a class does something based on its state conditionally (if or switch). If there are lots of conditional, this can lead to maintainence nightmare. It is very similar to Finite State Machines where we can have only certain states to visit from a certain state.

## Why?
More conditional statements will get added as the project evolves leading to maintainence nightmare.

## How?
This is very similar to the Strategy pattern, but only with a key difference. In Strategy pattern, the strategies (algorithm) doesn't know anything about other strategies. They are independent of each other. But, in the state pattern, the states might know about each other and an state also trigger change of the state of the context to another. The state-specific behaviours are separated to different classes. The original class, the context, stores one reference of one of the state objects that represents its current state, and delegates all the state-related work to that object. To replace the active state by another, we would expose a method to set a new state. The structure is very similar to the Strategy pattern. The state objects can also change the active state of the context internally. This is the main difference between the two patterns.

![State Design Pattern Example](https://github.com/sanjeevpr/design-patterns/blob/main/Resouces/state.png)

## Resources
- https://refactoring.guru/design-patterns/state
- Head First Design Patterns
