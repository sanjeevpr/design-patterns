# Observer Pattern
## What?
The Observer pattern lets provide mechanism for subscription to notify multiple objects about any events that happen to the object they're observing.

## Type
- Behavioural

## When?
When we need to provide subscription mechanism for observing changes of an object by other objects

## Why?
If suppose, an object wants to know get some when some event occurs in an object. We can do it by checking the object after some interval each time. And, this is very difficult to manage. So, instead we can subscribe to the object and the object would notify all the subcribing objects when change happens.

## How?
The publisher maintains a mechanism by which the subscribers can be added to the subscription list and removed as well. The Subscriber should be implementing a common interface so that different types of Subscribers can be supported in the Publisher. Similarly, we can also let different Publishers implement a common interface. A field of the Subscriber's interface is added in the Publisher class. The publisher class interacts with the interface. The subscribers implements the update method and does some business logic around it. The publisher can send some more details around the event.

![Observer Design Pattern Example](https://github.com/sanjeevpr/design-patterns/blob/main/Resources/observer.png)

## Resources
- https://refactoring.guru/design-patterns/observer
