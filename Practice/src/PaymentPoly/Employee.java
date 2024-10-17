package PaymentPoly;

public class Employee implements Payable{
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void pay() {
        System.out.println("Employee: " +this.name + "\nSalary: " + this.salary);
    }
}
