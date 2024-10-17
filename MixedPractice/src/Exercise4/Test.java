package Exercise4;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape("Rectangle", 4, 5);
        System.out.println("Rectangle area: " + rectangle.area() +"\nRectangle perimeter: " + rectangle.perimeter());
    }
}
