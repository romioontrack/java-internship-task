package intern.com;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    // 1. Private variables (Encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory;

    // 2. Constructor for initialization
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account opened with balance: ₹" + initialBalance);
    }

    // 3. Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // 4. Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposited: ₹" + amount);
        System.out.println("Deposit successful. Current Balance: ₹" + balance);
    }

    // 5. Withdrawal with business rules
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrawn: ₹" + amount);
            System.out.println("Withdrawal successful. Current Balance: ₹" + balance);
        }
    }

    // 7. Transaction history
    public void printTransactionHistory() {
        System.out.println("\nTransaction History for Account: " + accountNumber);
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
