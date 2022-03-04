# Singleton Pattern
## What?
The Singleton pattern ensures that the class has only one instance, while it is also globally accessible.

## Type
- Creational

## When?
1. When we really want to have just one instance
- We can control how many instances that the class has instead of the clients.
- Control access to some shared resource: a database, a file, etc.

2. Provide a global access point to that instance
- It protects the global variable's content from being overwritten if it is singleton.

3. Easier for garbage collection
- As only one object is used accross, it has very less impact on the GC.

## Why?
It solves the above three problems.

## How?
The only default constructor of the class is declared as private so it is not visible to the clients. The class exposes a static getInstance method, which return a cached instance every time it is called. The cache instance is saved in the private static field of the class.

![Singleton Design Pattern Example](https://github.com/sanjeevpr/design-patterns/blob/main/Resources/singleton.png)

## Resources
- https://refactoring.guru/design-patterns/singleton