package Exercise3;

public abstract class Student {
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public double[] getGrades() {
        return grades;
    }

    public abstract double calculateAverage();
}
