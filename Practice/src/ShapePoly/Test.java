package ShapePoly;

public class Test {
    public static void main(String[] args) {
        Shape shape[] = {new Rectangle(5, 4), new Circle(5)};
        for (Shape s : shape) {
            s.area();
            s.perimeter();
        }
    }
}
