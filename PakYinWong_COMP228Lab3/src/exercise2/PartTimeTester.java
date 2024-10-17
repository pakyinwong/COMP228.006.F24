package exercise2;

public class PartTimeTester extends GameTester{
    private double numberOfHours;
    //Constructor
    public PartTimeTester(String testerName, double numberOfHours) {
        super(testerName,false);
        this.numberOfHours = numberOfHours;
    }
    //end constructor
    @Override
    public double salary(){
        return numberOfHours * 20;
    }

    @Override
    public void display(){
        System.out.println("Part time tester");
        System.out.println("Tester Name: " + getTesterName());
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Salary: " + salary());
    }

}
