package CarInher;

public class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.print("The car is moving at " + speed + " km/h ");
    }
}
