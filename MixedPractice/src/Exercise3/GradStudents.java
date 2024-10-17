package Exercise3;

public class GradStudents extends Student{
    public GradStudents(String name, double[] grades) {
        super(name, grades);
    }
    @Override
    public double calculateAverage() {
        double sum = 0;
        for (double grade : getGrades()) {
            sum += grade;
        }
        return sum / getGrades().length * 1.1;
    }
}
