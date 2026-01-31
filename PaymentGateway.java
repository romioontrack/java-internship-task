package intern.com;

/**
 * PaymentGateway hides implementation details (Abstraction).
 */
public class PaymentGateway {

    private Payment paymentMode; // loose coupling

    public void setPaymentMode(Payment paymentMode) {
        this.paymentMode = paymentMode;
        System.out.println("[GATEWAY] Switched to " + paymentMode.getPaymentMode());
    }

    public void makePayment(double amount) {
        System.out.println("[GATEWAY] Initiating payment...");
        boolean status = paymentMode.processPayment(amount);

        if (status) {
            System.out.println("[GATEWAY] Payment successful ✅");
        } else {
            System.out.println("[GATEWAY] Payment failed ❌");
        }
    }
}

