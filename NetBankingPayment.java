package intern.com;

/**
 * Net Banking payment implementation.
 */
public class NetBankingPayment implements Payment {

    @Override
    public boolean processPayment(double amount) {
        if (amount < 100) {
            System.out.println("[NET BANKING] Minimum amount is ₹100.");
            return false;
        }
        System.out.println("[NET BANKING] Net Banking payment of ₹" + amount + " completed.");
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "Net Banking";
    }
}
