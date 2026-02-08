package src.creational.AbstractFactory;

public class Main {

    public static void main(String[] args) { 
        // we need the checkout service to do checkout
        // so create instance of checkout with the params like factory, gatewaytype 
        CheckoutService service = new CheckoutService(new USFactory(), "Stripe");
        service.completeOrder(100);
        System.err.println("----");

        System.err.println("----");
        
        CheckoutService service2 = new CheckoutService(new IndiaFactory(), "RazorPay");
        service2.completeOrder(44.5);

    }
}
