package CalMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("static Add: " + Calculator.add(5,4));
        System.out.println("static Subtract: " + Calculator.subtract(5,4));
        Calculator calculator = new Calculator();
        System.out.println("instance multiply: " + calculator.multiply(5,4));
        System.out.println("instance div: " + calculator.divide(5,4));
    }
}
