package Exercise1;

public class Test {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(123, 1000);
        CheckingAccount checkingAccount1 = new CheckingAccount(124, 500);
        savingsAccount1.deposit(200);
        checkingAccount1.deposit(300);
        System.out.println(savingsAccount1.calculateInterest()+savingsAccount1.getBalance());

    }
}
