package TrafficLightOOP;

public class Test {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " light - Stop for " + light.getDuration() + " seconds.");
        }
    }
}
