package Exercise1;

public class CheckingAccount extends Account {
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public double calculateInterest() {
        return 0;
    }
}
