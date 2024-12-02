import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1000);

        //Transaction List
        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(account, 200, true));
        transactions.add(new Transaction(account, 300, false));
        transactions.add(new Transaction(account, 400, true));
        transactions.add(new Transaction(account, 500, false));
        transactions.add(new Transaction(account, 600, true));

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (Transaction transaction : transactions) {
            executor.execute(transaction);
        }

        executor.shutdown();
    }
}