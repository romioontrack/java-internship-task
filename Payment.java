package intern.com;

/**
 * Payment interface defines common behavior for all payment modes.
 */
public interface Payment {

    boolean processPayment(double amount);

    String getPaymentMode();
}
