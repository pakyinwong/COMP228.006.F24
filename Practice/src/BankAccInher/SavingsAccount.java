package BankAccInher;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void applyInterest() {
        balance += balance * interestRate;
    }
}
