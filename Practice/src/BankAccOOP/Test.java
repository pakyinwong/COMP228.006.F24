package BankAccOOP;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount1 = new BankAccount(100123456, "Alice", 0);
        System.out.println("Account number: " + bankAccount1.getAccountNumber());
        String cont = "yes";
        while (cont.contentEquals("yes")) {
            System.out.println("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            bankAccount1.deposit(amount);
            System.out.println("Enter amount to withdraw: ");
            amount = sc.nextDouble();
            bankAccount1.withdraw(amount);
            System.out.println("Do you want to continue (yes/no)? ");
            cont = sc.next();
        }
    }
}
