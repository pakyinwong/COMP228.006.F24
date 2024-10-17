package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Mortgage[] mortgage = new Mortgage[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mortgage interest rate: ");
        double interestRate = scanner.nextDouble();
        for (int i = 0; i<mortgage.length; i++) {
            String mortgageType;
            do {
                System.out.println("Enter the mortgage type (Business/Personal): ");
                mortgageType = scanner.next();
                if (!mortgageType.equalsIgnoreCase("Business") && !mortgageType.equalsIgnoreCase("Personal")) {
                    System.out.println("Invalid mortgage type, please enter again");
                }
            } while (!mortgageType.equals("Business") && !mortgageType.equals("Personal"));
            System.out.println("Enter the mortgage number: ");
            int mortgageNumber = scanner.nextInt();
            System.out.println("Enter the customer name: ");
            String customerName = scanner.next();
            System.out.println("Enter the mortgage amount: ");
            double mortgageAmount = scanner.nextDouble();
            System.out.println("Enter the mortgage term: ");
            int term = scanner.nextInt();


            if (mortgageType.equalsIgnoreCase("Business")) {
                mortgage[i]  = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, term, interestRate);
            } else {
                mortgage[i]  = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, term, interestRate);
            }
        }
        System.out.println("\nMortgages information: ");
        System.out.println("*******************************");
        for (Mortgage m : mortgage){
            m.getMortgageInfo();
            System.out.println("*******************************");
        }
        scanner.close();
    }
}
