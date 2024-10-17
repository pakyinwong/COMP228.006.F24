package ShapePoly;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void area(){
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }

    @Override
    public void perimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}
