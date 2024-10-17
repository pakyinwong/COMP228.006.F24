package RectangleClass;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,4);
        double per = rectangle.rectanglePerimeter();
        double area = rectangle.rectangleArea();
        System.out.printf("Area: %.2f%nPerimeter: %.2f%n", area, per);
    }
}
