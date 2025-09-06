
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + amount);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Payment credit = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        credit.pay(2500);
        paypal.pay(1500);
    }
}