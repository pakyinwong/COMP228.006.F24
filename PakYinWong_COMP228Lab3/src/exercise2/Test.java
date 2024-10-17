package exercise2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tester name: ");
        String name = scanner.nextLine();

        System.out.println("Is full-time tester? (true/false): ");
        boolean isFullTime = scanner.nextBoolean();
        GameTester tester = null;
        if (isFullTime) {
            tester = new FullTimeTester(name);
        } else {
            System.out.println("How many hours worked? ");
            double hours = scanner.nextDouble();
            tester= new PartTimeTester(name, hours);
        }
        tester.display();
        scanner.close();
    }
}
