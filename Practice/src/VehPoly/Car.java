package VehPoly;

public class Car extends Vehicle {
    public Car(int speed){
        super(speed);
    }
    @Override
    public void move() {
        System.out.println("Car is moving at speed " + speed + " km/h");
    }
}
