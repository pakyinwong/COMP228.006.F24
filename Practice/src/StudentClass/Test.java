package StudentClass;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.grades = new double[]{85.0,90.5,78};

        System.out.println("Student Name: " + s1.name);
        s1.printGrades();
        System.out.println("Average Grade: " + s1.averageGrade());
    }
}
