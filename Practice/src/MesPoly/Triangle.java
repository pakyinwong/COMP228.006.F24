package MesPoly;

public class Triangle extends GeoShape{
    private double base;
    private double height;
    private double sideLength;

    public Triangle(String color, double base, double height, double sideLength) {
        super(color);
        this.base = base;
        this.height = height;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return base*height/2;
    }
    @Override
    public double getPerimeter() {
        return 3 * sideLength;
    }

}
