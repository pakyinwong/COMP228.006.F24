package Exercise4;

public class ShapeFactory {
    public static Shape createShape(String shapeType, double... dimensions) {
        return switch (shapeType){
            case "Rectangle" -> new Rectangle(dimensions[0], dimensions[1]);
            default ->  throw new IllegalArgumentException("Unsupported shape type");
        };
    }
}
