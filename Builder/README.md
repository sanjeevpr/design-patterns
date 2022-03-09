# Builder Pattern
## What?
The Builder pattern allows us to step by step build complex objects. The pattern allows us to produce different types and representation of the same object.  

## Type
- Creational

## When?
1. When we have lots of field to initialize
- We can easily bloat our constructor by initializing all the fields.

2. When we need different representation and configuration of the object 
- We would go with overloading the constructors that produces different representation of the object.

## Why?
It solves the above two problems. It also removes the logic of object constructor logic away from the client code.

## How?
1. The common Builder interface declares all the common steps for construction of the objects
2. The Builder interface are implemented by the Concrete Builders providing necessary logic for each steps. Each of these builders built a type of object.
3. The Director class may or may not be required. It is responsible to create various different objects by interacting with different types of builders.
4. The client must associate one of the builder objects with the director.

![Builder Design Pattern Example](https://github.com/sanjeevpr/design-patterns/blob/main/Resources/builder.png)

## Resources
- https://refactoring.guru/design-patterns/builder