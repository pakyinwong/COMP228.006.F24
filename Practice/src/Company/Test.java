package Company;

import Company.Department.Department;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice",12345);
        Department department = new Department("IT", employee);

        department.showDepartmentDetails();
    }
}
