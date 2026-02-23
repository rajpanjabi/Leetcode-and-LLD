package structural.Decorator;

public class WhippedCream extends CoffeeDecorator{
    // Here we have to init the base coffee
    public WhippedCream(Coffee coffee){
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

