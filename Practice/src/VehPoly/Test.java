package VehPoly;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle[] = {
                new Car(50),
                new Bike(20)
        };


        for (Vehicle v :vehicle){
            v.accelerate(10);
            v.move();
        }
    }
}
