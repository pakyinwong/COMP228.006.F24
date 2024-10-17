package CarOOP;

public class Car {
    String model;
    final Engine engine;
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    public void startCar(){
        engine.start();
        System.out.println(model);
    }
}
