package exercise2;
import javax.swing.*;

public class LottoGame {
    public static void main(String[] args) {
        int input=0;
        boolean won = false;
        for (int i=0;i<5;i++){
            while(true) {
                String inputString = JOptionPane.showInputDialog((i+1) + " Try. Please choose a number between 3 and 27:" );
                input=Integer.parseInt(inputString);
                if (input < 3 || input > 27) {
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please choose a number between 3 and 27.");
                } else {
                    break; // Valid input
                }
            }
            Lotto lotto = new Lotto();

            int sum = lotto.getSum();
            String msg = "Lotto's numbers are: " + lotto.getLotto()[0] + ' ' + lotto.getLotto()[1] + ' ' + lotto.getLotto()[2] + "\nSum: "+sum +"\nYour input: " + input;
            JOptionPane.showMessageDialog(null, msg);
            if (input == sum){
                won = true;
                break;
            }
        }
        if (won){
            JOptionPane.showMessageDialog(null, "You won!");
        } else {
            JOptionPane.showMessageDialog(null, "You lost!");
        }
    }
}
