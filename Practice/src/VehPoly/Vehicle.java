package VehPoly;

public abstract class Vehicle {
    protected int speed;
    public abstract void move();
    public void accelerate(int increment) {
        speed += increment;
    }
    public Vehicle(int speed) {
        this.speed = speed;
    }
}
