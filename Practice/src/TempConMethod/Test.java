package TempConMethod;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fah = scanner.nextDouble();
        TemperatureConverter.fahrenheitToCelsius(fah);

    }
}
