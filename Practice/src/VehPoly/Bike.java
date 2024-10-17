package VehPoly;

public class Bike extends Vehicle {
    public Bike(int speed) {
        super(speed);
    }
    @Override
    public void move() {
        System.out.println("Bike is moving at speed " + speed + " km/h");

    }
}
