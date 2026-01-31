package intern.com;

/**
 * Card Payment implementation.
 */
public class CardPayment implements Payment {

    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0 || amount > 100000) {
            System.out.println("[CARD] Payment declined due to limit issue.");
            return false;
        }
        System.out.println("[CARD] Card payment of ₹" + amount + " successful.");
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "Card";
    }
}
