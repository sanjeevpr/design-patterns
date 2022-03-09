# Adapter Pattern
## What?
The Adapter patterns allows objects of incomptible interfaces to collaborate.

## Type
- Structural

## When?
1. When we want to use a class, but the interface is not compatible with rest of our code.
- It creates a middle-layer which serves as a translator between our code and the class.

## Why?
It makes incompatible interfaces to collaborate. 

## How?
- We should have one or more client classes and a service class which we can't change (often 3rd-party, legacy or with lots of dependencies).
- Declare a client interface and describe how clients communicate with the service.
- Create a adapter and make it follow the client interface. Implement all the methods of the client interface.
- Add a field to the adapter class to store the reference of the service class.

![Adapter Design Pattern Example](https://github.com/sanjeevpr/design-patterns/blob/main/Resources/adapter.png)

## Resources
- https://refactoring.guru/design-patterns/adapter
