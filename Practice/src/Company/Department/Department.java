package Company.Department;

import Company.Employee;

public class Department {
    private String departmentName;
    Employee employee;
    public Department(String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
    }
    public void showDepartmentDetails() {
        System.out.println("Department: " + departmentName + "\n" + employee.getEmployeeInfo());

    }
}
