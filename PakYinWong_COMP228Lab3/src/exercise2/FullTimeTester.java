package exercise2;

public class FullTimeTester extends GameTester{
    //constructor
    public FullTimeTester(String testerName ) {
        super(testerName, true);
    }
    //end constructor

    @Override
    public double salary(){
        return 3000;
    }
    @Override
    public void display(){
        System.out.println("Full time tester");
        System.out.println("Tester Name: " + getTesterName());
        System.out.println("Salary: " + salary());
    }
}
