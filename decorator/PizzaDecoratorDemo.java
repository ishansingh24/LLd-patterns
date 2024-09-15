// Component Interface
interface Pizza {
    String getDescription();
    double cost();
}

// Concrete Component
class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}

// Abstract Decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double cost() {
        return decoratedPizza.cost();
    }
}

// Concrete Decorators
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.50;
    }
}

class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2.00;
    }
}

class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Olives";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.00;
    }
}

// Client code to test the decorators
public class PizzaDecoratorDemo {
    public static void main(String[] args) {
        Pizza myPizza = new PlainPizza();
        System.out.println(myPizza.getDescription() + " $" + myPizza.cost());

        myPizza = new CheeseDecorator(myPizza);
        System.out.println(myPizza.getDescription() + " $" + myPizza.cost());

        myPizza = new PepperoniDecorator(myPizza);
        System.out.println(myPizza.getDescription() + " $" + myPizza.cost());

        myPizza = new OliveDecorator(myPizza);
        System.out.println(myPizza.getDescription() + " $" + myPizza.cost());
    }
}
