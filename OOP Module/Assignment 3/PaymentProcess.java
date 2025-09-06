abstract class Payment {
    abstract void pay();
}
class CreditCardPayment extends Payment {
    private String cardNumber;
    private double amount;
    CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }
    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid");
    }
}

class UPIPayment extends Payment {
    private String upiId;
    private double amount;
    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }
    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + amount + " Paid");
    }
}

public class PaymentProcess {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCardPayment("1234567890123456", 5000);
        p.pay();
        p = new UPIPayment("rahul@upi", 2000);
        p.pay();
    }
}