package intern.com;

/**
 * UPI Payment implementation.
 */
public class UPIPayment implements Payment, Refundable {

    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("[UPI] Invalid payment amount.");
            return false;
        }
        System.out.println("[UPI] Processing UPI payment of ₹" + amount);
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "UPI";
    }

    @Override
    public void refund(double amount) {
        System.out.println("[UPI] Refunded ₹" + amount);
    }
}

