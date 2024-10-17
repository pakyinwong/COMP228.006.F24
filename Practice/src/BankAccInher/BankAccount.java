package BankAccInher;


import java.util.Scanner;

public class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {

        this.balance += amount;


    }
    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return this.balance;
    }
}
