package Exercise3;

public class Test {
    public static void main(String[] args) {
        double[] underGrades = {85,90,70};
        double[] gradGrades = {60,70,75};
        UndergraduateStudent student1 = new UndergraduateStudent("Alice", underGrades);
        GradStudents student2 = new GradStudents("Bob", gradGrades);
        System.out.println(student1.calculateAverage());
        System.out.println(student2.calculateAverage());
    }
}
