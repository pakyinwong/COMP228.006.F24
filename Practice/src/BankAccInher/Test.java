package BankAccInher;

public class Test {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123456, 1000, 0.05);
//        savingsAccount.deposit(100);
        savingsAccount.applyInterest();
        System.out.println("Savings account balance after deposit and interest: " + savingsAccount.getBalance());
    }
}
