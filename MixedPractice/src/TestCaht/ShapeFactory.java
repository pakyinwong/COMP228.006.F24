package TestCaht;

public class ShapeFactory {
    //Create a class ShapeFactory with a static method createShape(String type, double...
    //dimensions) that returns a Shape .

    public static Shape createShape(String shapeType, double... dimensions) {
        return switch (shapeType){
            case "Circle" -> new Circle(dimensions[0]);
            case "Rectangle" -> new Rectangle(dimensions[0], dimensions[1]);
            default ->  throw new IllegalArgumentException("Unsupported shape type");
        };
    }
}
