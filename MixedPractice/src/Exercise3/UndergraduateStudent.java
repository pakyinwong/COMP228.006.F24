package Exercise3;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, double[] grades) {
        super(name, grades);
    }
    @Override
    public double calculateAverage() {
        double sum = 0;
        for (double grade : getGrades()) {
            sum += grade;
        }
        return sum / getGrades().length;
    }
}
