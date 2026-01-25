package intern.com;

public class BankApp {

    public static void main(String[] args) {

        // 6. Create multiple account objects
        BankAccount acc1 = new BankAccount("ACC101", "Shashi Sharma", 5000);
        BankAccount acc2 = new BankAccount("ACC102", "Amit Kumar", 3000);

        // 8. Object interaction
        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(1000);
        acc2.withdraw(5000); // Invalid transaction

        // Display transaction history
        acc1.printTransactionHistory();
        acc2.printTransactionHistory();
    }
}
