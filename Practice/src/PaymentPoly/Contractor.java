package PaymentPoly;

public class Contractor implements Payable {
    private String name;
    private double hourlyRate;
    private double hourWorked;
    public Contractor(String name, double hourlyRate, double hourWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hourWorked = hourWorked;
    }
    public void pay() {
        System.out.println("Employee: " +this.name + "\nPayment: " + hourlyRate*hourWorked);
    }
}
