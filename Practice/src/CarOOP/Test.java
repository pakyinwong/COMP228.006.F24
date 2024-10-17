package CarOOP;

public class Test {
    public static void main(String[] args) {
        Engine engine = new Engine("Electric");
        Car car = new Car("Tesla Model Y",engine);
        car.startCar();
    }
}
