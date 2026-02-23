package structural.Decorator;

// these are the decorators/toppings that would extend the CoffeeDecorator class
public class Milk extends CoffeeDecorator{
    // Here we have to init the base coffee
    public Milk(Coffee coffee){
        super(coffee);
    }
    @Override
    public int getCost(){
        return coffee.getCost() +2;
    }
    @Override
    public String getDescription(){
        return coffee.getDescription() +" Milk";
    }
    
}
