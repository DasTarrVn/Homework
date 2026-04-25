public class PaymentProcessor {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment("1234-5678-9012", "DASTAR", 1000.0);
        PaymentMethod paypal = new PayPalPayment("dastar@ubuntu.com", 500.0);

        Transaction tx1 = new Transaction(creditCard, 200.0);
        tx1.execute();

        Transaction tx2 = new Transaction(paypal, 100.0);
        tx2.execute();

        tx1.issueRefund();
        tx2.issueRefund();

        System.out.println("Balance Credit Card: " + creditCard.getBalance());
        System.out.println("Balance PayPal: " + paypal.getBalance());
    }
}