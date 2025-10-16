package exercise7;

import java.util.Scanner;

//inputs temperature in degrees Fahrenheit and outputs the temperature in equivalent degrees Celsius.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temp = new Temperature();
        System.out.print("Enter temperature in degrees Fahrenheit (°F): ");
        double inputDegree = scanner.nextDouble();

        temp.setFahrenheit(inputDegree);
        System.out.printf("The temperature in Celsius degree = %.1f°C",temp.toCelsius());

        scanner.close();
    }
}
