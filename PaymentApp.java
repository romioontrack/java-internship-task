package intern.com;

/**
 * Main application to demonstrate payment gateway simulation.
 */
public class PaymentApp {

    public static void main(String[] args) {

        PaymentGateway gateway = new PaymentGateway();

        // Switching payment modes dynamically
        Payment upi = new UPIPayment();
        Payment card = new CardPayment();
        Payment netBanking = new NetBankingPayment();

        gateway.setPaymentMode(upi);
        gateway.makePayment(1500);

        // Refund demonstration (multiple inheritance)
        if (upi instanceof Refundable) {
            ((Refundable) upi).refund(1500);
        }

        gateway.setPaymentMode(card);
        gateway.makePayment(200000); // invalid case

        gateway.setPaymentMode(netBanking);
        gateway.makePayment(50); // invalid case
        gateway.makePayment(5000); // valid case
    }
}
