package structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem{

    private String bundleName;
    List<CartItem> items;

    public ProductBundle(String name){
        this.bundleName=name;
        items=new ArrayList<>();
    }
    public void addItem(CartItem item){
        items.add(item);
    }

    @Override
    public double getPrice(){
        // I need to iterate over the items in the list and add it up
        double total=0.0;
        for (CartItem item : items){
            total+=item.getPrice();
        }
        return total;
    }

    @Override
    public void display(){
        System.out.println("");
        System.out.println("Bundle: " + bundleName + " Total Price: " + getPrice());
        for (CartItem item: items){
            System.out.println("");
            item.display();
        }
    }
    
}
