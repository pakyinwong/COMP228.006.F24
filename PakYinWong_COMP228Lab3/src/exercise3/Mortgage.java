package exercise3;

public abstract class Mortgage implements MortgageConstants{
    private int mortgageNumber;
    private String customerName;
    private double mortgageAmount;
    protected double interestRate;
    private int term;

    //Constructor
    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        if (mortgageAmount > 300000){
            this.mortgageAmount = 300000;
        } else if (mortgageAmount < 0){
            this.mortgageAmount = 0;
        } else {
            this.mortgageAmount = mortgageAmount;
        }
        if (term == 1){
            this.term = 1;
        } else if (term == 3){
            this.term = 3;
        } else if (term == 5){
            this.term = 5;
        } else {
            this.term = 1;
        }
    }//end constructor
    public void getMortgageInfo() {
        System.out.println("Mortgage Number: " + mortgageNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Mortgage Amount: " + mortgageAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Term: " + term);
    }
}
