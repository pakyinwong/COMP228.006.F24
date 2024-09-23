package exercise2;
import java.util.Random;

public class Lotto {
    private int [] lotto;
    private int sum;
    public Lotto() {
        lotto = new int[3];
        Random random = new Random();
        for (int i = 0; i<lotto.length; i++) {
            lotto[i] = random.nextInt(9)+1;
        }
        sum = 0;
        for (int num : lotto) {
            sum += num;
        }
    }
    public int[] getLotto() {
        return lotto;
    }
    public int getSum() {
        return sum;
    }
}
