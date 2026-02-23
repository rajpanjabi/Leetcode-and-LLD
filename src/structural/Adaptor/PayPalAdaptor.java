package structural.Adaptor;

// this is the adaptee class that would act as an extra layer to help us make the classes compatible

public class PayPalAdaptor implements PaymentGateway{
    // since this is dependent on the paypal class, we init it whenever paypaladaptor instance is created
    Paypal paypal;
    public PayPalAdaptor(){
        paypal= new Paypal();
    }
    
    @Override
    public void pay(String orderId, double amount){
        // we now delegate this to the actual paypal class
        paypal.makePayment(orderId, amount);
    }
}
