package MesPoly;

public class Test {
    public static void main(String[] args) {
        GeoShape shape[] = {
                new Triangle("Red", 4,5,3),
                new Square("Blue", 5)
        };
        for (GeoShape s : shape) {
            s.getArea();
            s.getPerimeter();
            System.out.println(s.getArea() + " " + s.getPerimeter());
        }
    }
}
