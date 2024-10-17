package MesPoly;

import java.awt.*;

public class Square extends GeoShape{
    protected double sideLength;
    public Square(String color,double sideLength){
        super(color);
        this.sideLength = sideLength;
    }
    @Override
    public double getArea() {
        return sideLength*sideLength;
    }
    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }
}
