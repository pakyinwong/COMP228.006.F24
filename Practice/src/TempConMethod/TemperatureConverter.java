package TempConMethod;

public class TemperatureConverter {
//    private double celsius;
//    private double fahrenheit;
//
//    public void setCelsius(double celsius) {
//        this.celsius = celsius;
//    }
//    public void setFahrenheit(double fahrenheit) {
//        this.fahrenheit = fahrenheit;
//    }

    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        System.out.printf("%.1f Celsius in Fahrenheit: %.1f%n", celsius, fahrenheit);
    }
    public static void fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("%.1f Fahrenheit in Celsius: %.1f%n", fahrenheit, celsius);
    }
}
