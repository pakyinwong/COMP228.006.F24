package PaymentPoly;

public class Test {
    public static void main(String[] args) {
        Payable payable[]={new Employee("Yin", 3000.0), new Contractor("Alice", 20, 20)};
        for (Payable p : payable) {
            p.pay();
        }
    }
}
