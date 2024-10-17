package ShapeInher;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println("Drawing Circle with color " + color + " and radius " + radius);
    }
}
