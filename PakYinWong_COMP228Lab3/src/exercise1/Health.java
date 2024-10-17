package exercise1;

public class Health extends Insurance{
    public Health() {
        super("Health Insurance");
    }

    @Override
    public void setInsuranceCost(double cost) {
        setMonthlyCost(cost);
    }

    @Override
    public void display() {
        System.out.println("Type of Insurance: " + getTypeOfInsurance());
        System.out.println("Monthly Cost: " + getMonthlyCost());
    }
}
