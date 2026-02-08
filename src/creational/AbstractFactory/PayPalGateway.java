package src.creational.AbstractFactory;

public class PayPalGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount){
        System.out.println("PayPal processing payment: "+ amount);
    }
}
