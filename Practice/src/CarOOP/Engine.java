package CarOOP;

public class Engine {
    String type;
    public Engine(String type) {
        this.type = type;
    }
    public void start(){
        System.out.print("Starting the "+ type +" engine of ");
    }
}
