package BankAccountClass;

public class Test {
    public static void main(String[] args) {
        BankAccount test = new BankAccount("John", 0);
        double amount;
        amount = 500;
        test.deposit(amount);
        System.out.println("Deposit: " + amount);
        System.out.println(test.getBalance());
        amount = 200;
        test.withdraw(amount);
        System.out.println("Withdraw: " + amount);
        System.out.println(test.getBalance());
        amount = 400;
        test.withdraw(amount);

    }
}
