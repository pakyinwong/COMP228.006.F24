package CarInher;

public class Car extends Vehicle {
    private int fuellevel;
    public Car(int speed, int fuellevel) {
        super(speed);
        this.fuellevel = fuellevel;
    }
    @Override
    public void move() {
        super.move();
        System.out.print("with a fuel level of " + fuellevel + "%\n");
    }
}
