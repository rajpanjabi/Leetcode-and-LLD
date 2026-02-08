package src.creational.AbstractFactory;

public class StripeGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount){
        System.out.println("Stripe processing payment "+ amount);
    }
    
}


