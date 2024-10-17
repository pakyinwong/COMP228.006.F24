package exercise3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, int term, double interestRate) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        this.interestRate = interestRate + 1;
    }
}
