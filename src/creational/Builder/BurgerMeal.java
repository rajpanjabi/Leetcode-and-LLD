package src.creational.Builder;

import java.util.List;

public class BurgerMeal {

    // we make all the attributes final, so the Burger object is immutable once it's created.

    // Required parameters
    private final String burgerType;
    private final String bunType;

    // Optional parameters
    private final boolean hasCheese;
    private final boolean hasFries;
    private final boolean hasDrink;
    private final List<String> toppings;

    // Constructor is private to enforce the use of the Builder
    private BurgerMeal(BurgerBuilder builder){
        this.burgerType=builder.burgerType;
        this.bunType=builder.bunType;
        this.hasCheese=builder.hasCheese;
        this.hasFries=builder.hasFries;
        this.hasDrink=builder.hasDrink;
        this.toppings=builder.toppings;
    }

    // ToString method to see the burger object
    @Override
    public String toString(){
        return "Burger object \n" + "burgerType:" + burgerType + "\n" + "bunType: " + bunType+ "\n" + "hasCheese: " + hasCheese + "\n"+ "hasFries: " + hasFries + "\n"+ "hasDrink: " + hasDrink;
    }


    // we use a static nested inner class for the builder object
    public static class BurgerBuilder{
        // Mandatory
        private final String burgerType;
        private final String bunType;
        // Optional
        private boolean hasCheese;
        private boolean hasFries;
        private boolean hasDrink;
        private List<String> toppings;
        // the main constructor build an object using required params

        public BurgerBuilder(String burgerType, String bunType){
            this.burgerType=burgerType;
            this.bunType=bunType;
        }
        public BurgerBuilder withCheese(boolean hasCheese){
            this.hasCheese=hasCheese;
            return this;
        }
        public BurgerBuilder withFries(boolean hasFries){
            this.hasFries=hasFries;
            return this;
        }
        public BurgerBuilder withDrink(boolean hasDrink){
            this.hasDrink=hasDrink;
            return this;
        }
        public BurgerBuilder withToppings(List<String> toppings){
            this.toppings=toppings;
            return this;
        }
        public BurgerMeal build(){
            return new BurgerMeal(this);
        }
       

    }


    
}

class Main{
    public static void main(String[] args) {
        // Now if I want a BurgerMeal, I create it's instance using the builder object
        BurgerMeal burger1= new BurgerMeal.BurgerBuilder("Veggie", "Whole-wheat").build();
        BurgerMeal burger2= new BurgerMeal.BurgerBuilder("Chicken", "Regular").withCheese(true).withDrink(true).build();
        System.out.println(burger1.toString());
        System.out.println("-----");
        System.out.println("-----");

        System.out.println(burger2.toString());
    }
}