package BankAccInher;

public class CheckingAccount extends BankAccount{
    private double tranFee;
    public CheckingAccount(int accountNumber, double balance, double tranFee){
        super(accountNumber, balance);
        this.tranFee = tranFee;
    }
    @Override
    public void withdraw(double amount) {
        if (amount + tranFee < this.balance) {
            this.balance  = this.balance - amount - tranFee;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
