package StudentClass;

public class Student {
     String name;
     double[] grades;

    public double averageGrade() {
        double sum = 0;
        for (double grade:grades) {
            sum += grade;
        }
        return sum/grades.length;
    }

    public void printGrades() {
        System.out.print("Grade: ");
        for (double grade:grades) {
            System.out.print(grade+" ");
        }
        System.out.println();
    }
}
