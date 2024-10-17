package Exercise1;

public abstract class Account {
    private int accountNumber;
    private double balance;

    public abstract double calculateInterest();
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
