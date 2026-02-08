**Abstract Factory**

Let's take a classic example of a Checkout Service. We want the Checkout Service to handle two main things processpayment and generate the invoice.

For these two tasks, it needs a Payment Gateway that processes payment and generates invoice.
Now there are multiple payment gateway options and different invoice types as well.

So, we abstract the logic and create an interface PaymentGateway that is implemented by different tyeps like PayPal, Stripe, RazorPay, PayU, etc. 

Similarly for invoice, we create an Invoice interface which is again implemented by different invoice types like GSTInvoice, USInvoice, and so on..

To make sure, SRP is achieved we can use Factory method and it would work if the region was limited just to one area, but now another complexity here  would be that these tasks should be region specific, which is different regions should be handled. For that we have to make the factory abstract.

So we create a RegionFactory interface which is then implemented by region-based factories like India and US.
