package exercise1;

abstract class Insurance {
    private String typeOfInsurance;
    private double monthlyCost;

    //Constructor
    public Insurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }//end constructor

    //Getter
    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }
    public double getMonthlyCost() {
        return monthlyCost;
    }
    //Setter
    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }
    //Abstract Method
    public abstract void setInsuranceCost(double cost);
    public abstract void display();
}
