# Factory Pattern
## What?
The Factory patterns provides mechanism to create objects without exposing the instantiation logic to the client.

## Type
- Creational

## When?
1. When we don't know beforehand the exact types and dependencies of the objects your code should work with
- It separates the product construction code from the code that actually uses the product. Therefore it is easier to extend the product construction code independently from the rest of the code.
Ex: when we add a new product type to the app, we'll only need to create the new creator subcalss and override the factory method in it.

## Why?
It helps us separate the object creation logic from the class and delegates to the factory method. So, the client would just need to call the factory method to create the object. Through this decoupling, we adhere to Single Responsibility Principle and also Open/Closed Principle.

## How?
- The concreate objects that we want to create need to implement the a common interface.
- The common interface/Product should abstract the common logic.
- The Factory/Creator class/interface/abstract class may have a abstract createProduct method returning the base Product interface.
- The Fcatory class can be extended by various creator classes that have the responsibility of creating individual Product subclasses.
- The above step can be avoided if we have too many types of product to be created. We can have conditional statement in the base Factory/Creator class only to create products.

![Factory Design Pattern Example](https://github.com/sanjeevpr/design-patterns/blob/main/Resources/factory.png)

## Resources
- https://refactoring.guru/design-patterns/factory-method
- https://www.oodesign.com/factory-pattern.html
