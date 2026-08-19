public class CreditCardPayment extends PaymentMethod implements Refundable {
    private String cardNumber;
    private String cardHolder;
    private static final double OVERDRAFT_LIMIT = 500.0;

    public CreditCardPayment(String cardNumber, String cardHolder, double balance) {
        super(balance);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount <= (balance + OVERDRAFT_LIMIT)) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean refund(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card [Holder: " + cardHolder + ", Card Number: " + cardNumber + "]";
    }
}