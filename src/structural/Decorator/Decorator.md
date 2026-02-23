
The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, dynamically at runtime, without affecting the behavior of other objects from the same class.

It wraps an object inside another object that adds new behaviors or responsibilities at runtime, keeping the original object's interface intact.

It solves the problem of class explosion that occurs when you try to use inheritance to add combinations of behavior. For Example, imagine you have:

A Pizza
A CheesePizza
A CheeseAndOlivePizza
A CheeseAndOliveStuffedPizza

```java
// Each combination of pizza requires a new class
class PlainPizza {}
class CheesePizza extends PlainPizza {}
class OlivePizza extends PlainPizza {}
class StuffedPizza extends PlainPizza {}
class CheeseStuffedPizza extends CheesePizza {}
class CheeseOlivePizza extends CheesePizza {}
class CheeseOliveStuffedPizza extends CheeseOlivePizza {}
```

The problem here is with increase in nos of toppings, the combinations grow exponentially. To fix this, we use decorator pattern. Here we create a decorator abstract class that implements the base interface. Now all the other toppings/classes implement this decorator(which under the hood implements the base interface), and we only need classes equal to the number of toppings and not equal to nos of combinations.

For each combination, we stack it up. We create a base object (coffee), for each additional layer, we use this as a base and use the decorator to build another object on its top, and so on.. forming a linear chain of objects. Finally we use the last/topmost decorator and access the properties and attributes.

Each decorator acts like a layer, similar to wrapping a gift box. Every decorator adds behavior on top of the previous one, allowing for flexible and dynamic composition of functionality.

The Decorator Pattern functions like a call stack, where behavior is accumulated step by step as each decorator wraps the component. This stacked behavior is then unwrapped during method calls, preserving the order and layering.

Best time to use this pattern is:

You need to add responsibilities to objects dynamically:
Instead of hardcoding behaviors into a class, decorators allow you to attach additional functionality at runtime, offering great flexibility.

For every possible combination of features, creating separate subclasses leads to unmanageable and bloated class hierarchies. Decorators eliminate this by composing behaviors.

The Decorator Pattern is widely used in real-life software products to enable dynamic behavior composition without bloating the class hierarchy. Below are practical examples where it plays a critical role:

1. Food Delivery Applications (e.g., Swiggy, Zomato): Customers can customize food items with add-ons like extra cheese, sauces, toppings, or side dishes.

2. Google Docs or Word Processors: Users can apply text formatting like bold, italic, or underline independently or in combination.

