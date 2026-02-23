package structural.Decorator;

public class Main {

    public static void main(String[] args) {
        // Now we can create a coffee object with different decorators easily
        // First we need to create an object of a concrete class that implements the interface like PlainCoffee
        // Now to add modifications we can built on top of this plaincoffee
        Coffee plain = new PlainCoffee();
        Coffee milk = new Milk(plain);
        Coffee sugarMilkCoffee=new Sugar(milk);
        System.out.println(sugarMilkCoffee.getCost());
        System.out.println(sugarMilkCoffee.getDescription());

    }
    
}
