package structural.Decorator;

public class PlainCoffee implements Coffee {
    @Override
    public String getDescription(){
        return "base coffee black";
    }
    @Override
    public int getCost(){
        return 3;
    }
}
