package exercise1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Insurance[] insurance = new Insurance[2];

        for(int i =0 ; i<insurance.length; i++){
            System.out.println("Enter the name of Insurance (Health or Life):");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("Health")){
                insurance[i]=new Health();
            } else if (name.equalsIgnoreCase("Life")){
                insurance[i]=new Life();
            } else {
                System.out.println("Invalid name.");
                i--;
                continue;
            }
            System.out.println("Enter the monthly cost:");
            double cost = sc.nextDouble();
            sc.nextLine();
            insurance[i].setInsuranceCost(cost);
        }
        System.out.println("\n********************");
        for(Insurance i: insurance){
            i.display();
            System.out.println("********************");
        }
        sc.close();
    }
}
