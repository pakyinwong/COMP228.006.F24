package exercise1;

public class Life extends Insurance {

    public Life() {
        super("Life Insurance");
    }

    @Override
    public void setInsuranceCost(double cost){
        setMonthlyCost(cost);
    }

    @Override
    public void display(){
        System.out.println("Type of Insurance: " + getTypeOfInsurance());
        System.out.println("Monthly Cost: " + getMonthlyCost());
    }
}
