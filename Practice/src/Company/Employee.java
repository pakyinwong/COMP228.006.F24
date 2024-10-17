package Company;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeInfo(){
        return "Employee Name: " + name + "\nEmployee ID: " + id;
    }
}
