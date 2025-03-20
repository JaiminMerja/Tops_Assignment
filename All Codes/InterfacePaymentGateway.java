interface PaymentGateway 
{
    void processPayment(double amount);
}

class PayPal implements PaymentGateway 
{
    @Override
    public void processPayment(double amount) 
    {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class CreditCard implements PaymentGateway 
{
    @Override
    public void processPayment(double amount) 
    {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

public class InterfacePaymentGateway 
{
    public static void main(String[] args) 
    {
        PaymentGateway paypal = new PayPal();
        paypal.processPayment(150.75);

        PaymentGateway creditCard = new CreditCard();
        creditCard.processPayment(269.99);
    }
}
