package CircleClass;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        double area = circle.calculateArea();
        double cir = circle.calculateCircumference();

        System.out.printf("Area: %.2f%n" , area);
        System.out.printf("Circumference: %.2f%n", cir);
    }
}
