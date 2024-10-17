package MesPoly;

public abstract class GeoShape implements Measure {
    protected  String color;
    public GeoShape(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
