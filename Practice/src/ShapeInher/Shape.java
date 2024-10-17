package ShapeInher;

public class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    public void draw() {
        System.out.print("Drawing a shape ");
    }
}
