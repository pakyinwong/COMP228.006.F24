package TestCaht;

public class Test {
    //In the main() method, use ShapeFactory to create shapes rectangle and circle and print their area
    //and perimeter.

    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape("Rectangle", 4, 5);
        System.out.println("Rectangle area: " + rectangle.area() +"\nRectangle perimeter: " + rectangle.perimeter());

        Shape circle = ShapeFactory.createShape("Circle", 4);
        System.out.println("Circle area: " + circle.area() +"\nCircle perimeter: " + circle.perimeter());

    }


}
