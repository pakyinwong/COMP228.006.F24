package ShapePoly;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void area(){
        System.out.println("Area of Rectangle: " + this.width * this.height);
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter of Rectangle: " + (this.width + this.height) * 2);
    }
}
