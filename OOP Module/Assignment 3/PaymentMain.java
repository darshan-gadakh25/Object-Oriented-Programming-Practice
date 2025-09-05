import java.util.Scanner;

abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    String cardNumber;
    double amount;

    CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + (int)amount + " Paid");
    }
}

class UPIPayment extends Payment {
    String upiId;
    double amount;

    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + (int)amount + " Paid");
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardNumber = sc.next();
        double amount = sc.nextDouble();
        CreditCardPayment ccp = new CreditCardPayment(cardNumber, amount);
        ccp.pay();

        String upiId = sc.next();
        amount = sc.nextDouble();
        UPIPayment upi = new UPIPayment(upiId, amount);
        upi.pay();
    }
}
