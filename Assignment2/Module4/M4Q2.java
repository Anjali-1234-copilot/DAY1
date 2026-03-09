interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card " + cardNumber);
    }
}

class UPIPayment implements Payment {
    private String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI ID " + upiId);
    }
}

public class M4Q2 {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment("1234-5678-9012");
        Payment upi = new UPIPayment("user@upi");

        creditCard.pay(1500.0);
        upi.pay(750.0);
    }
}
