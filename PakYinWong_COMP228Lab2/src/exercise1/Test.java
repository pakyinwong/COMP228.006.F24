package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private int correctCount = 0;
    private int incorrectCount = 0;
    private Random randomObject = new Random();

    //Method
    public void simulateQuestion(String question, int correctOption) {
        String input = JOptionPane.showInputDialog(null, question, "TEST", JOptionPane.QUESTION_MESSAGE);
        int answer = Integer.parseInt(input); // Get the user's input as integer
        checkAnswer(answer, correctOption);
    }

    //Method
    public void checkAnswer(int answer, int correctOption) {
        answer = Character.toUpperCase(answer);
        if (answer == correctOption) {
            correctCount++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            incorrectCount++;
            JOptionPane.showMessageDialog(null, generateMessage(false) + "\nCorrect answer is " + correctOption);
        }
    }

    //Method
    public String generateMessage(boolean isCorrect) {
        //Random message
        switch ( randomObject.nextInt( 4 ) )
        {
            case 0:
                return isCorrect ? "Excellent!" : "No. Please try again.";
            case 1:
                return isCorrect ? "Good!" : "Wrong. Try once more.";
            case 2:
                return isCorrect ? "Keep up the good work!" : "Don't give up!";
            case 3:
                return isCorrect ? "Nice work!" : "No. Keep trying..";
        }
        return "";
    }

    //Method
    public void inputAnswer() {
        //Questions
        simulateQuestion("Which of the following typically groups related classes so that they could be imported into programs and reused? \n1) Package\n2) IDE\n3) Method\n4) Function", 1);
        simulateQuestion("There are variables for which each object of a class does not need its own separate copy. They are called_______________.\n \n1) local variables\n2) constants\n3) class variables\n4) instance variables", 3);
        simulateQuestion("Class variables must be declared as___________. \n1) final\n2) static\n3) var\n4) const", 2);
        simulateQuestion("Which of the following components does a Java application need to have at least one of? \n1) Class \n2) Local variable\n3) Non-static Method\n4) Instance variable", 1);
        simulateQuestion("Method arguments may be______________________________. \n1) only variables\n2) only strings.\n3) constants, variables, or expressions.\n4) only constants.", 3);

        //Display final result
        int total = 5;
        double percentage = ((double) correctCount / total) * 100;
        JOptionPane.showMessageDialog(null, "Final Result:\nCorrect: " + correctCount + "\nIncorrect: " + incorrectCount + "\nPercentage: " + percentage + "%");
    }
}
