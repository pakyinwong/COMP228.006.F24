public class Account {
    private double balance;

    //Constructor
    public Account(double balance) {
        this.balance = balance;
    }
    public synchronized double getBalance() {
        return balance;
    }
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " ,deposited: $" + amount + " ,New balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + "Invalid amount!");
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " ,withdraw: $" + amount + " ,New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println(Thread.currentThread().getName() + "Insufficient balance!");
        } else {
            System.out.println(Thread.currentThread().getName() + "Invalid amount!");
        }
    }
}
