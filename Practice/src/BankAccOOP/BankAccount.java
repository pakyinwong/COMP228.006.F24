package BankAccOOP;

public class BankAccount {
    private String name;
    private double balance;

    private final int accountNumber;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        displayBalance();
    }
    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            displayBalance();
        } else {
            System.out.println("Insufficient balance");
        }

    }
    public void displayBalance() {
        System.out.printf("Current balance is: %.2f%n" , balance);
    }
}
