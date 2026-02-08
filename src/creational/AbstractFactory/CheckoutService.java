package src.creational.AbstractFactory;

public class CheckoutService {
    // this needs paymentGateway and Invoice to do its job
    private final PaymentGateway gateway;
    private final Invoice invoice;
    public CheckoutService(RegionFactory factory, String gatewayType){
        this.gateway=factory.createPaymentGateway(gatewayType);
        this.invoice=factory.createInvoice();
    }
    public void completeOrder(double amount){
        gateway.processPayment(amount);
        invoice.generateInvoice();
        System.out.println("Successful checkout");
    }
}
