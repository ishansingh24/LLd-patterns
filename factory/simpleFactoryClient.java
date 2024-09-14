/*
 *
 *  Simple Factory Method Pattern
 *  The Simple Factory Method Pattern (often just referred to as the "Simple Factory" pattern) provides a single method 
 *  that creates instances of different classes based on provided input. This method is not part of a class hierarchy 
 *  but is rather a standalone class that contains the factory logic.

 *  Characteristics:

*   Single Factory Class: There is a single factory class responsible for creating instances of different products.
*   No Interface for Factory: The factory method is usually a static method in the factory class.
*   Less Flexibility: The pattern is less flexible because adding new types of products often requires changes to the factory class.
 * 
 * 
 */

// Product.java
interface Product {
    void doSomething();
}

// ConcreteProductA.java
class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("ConcreteProductA doing something.");
    }
}

// ConcreteProductB.java
class ConcreteProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("ConcreteProductB doing something.");
    }
}

// SimpleFactory.java
class SimpleFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}

// Main.java
public class simpleFactoryClient {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.doSomething();  // Output: ConcreteProductA doing something.

        Product productB = SimpleFactory.createProduct("B");
        productB.doSomething();  // Output: ConcreteProductB doing something.
    }
}
