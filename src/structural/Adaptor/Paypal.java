package structural.Adaptor;

public class Paypal {
    // Now here this class doesn't implement the paymentgateway interface, but the functions in a similar fashion,
    // so to use it seamlessly we create a Adaptee class that would implement that gateway, but for the fucntionality,
    // delegate the logic to this class
    public void makePayment(String orderId, double amount){
        System.out.println("Paid Rs. " + amount + " using PayPal for order: " + orderId);
    }
    
}
