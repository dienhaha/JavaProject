package exercise7.exercise8;

import exercise7.Temperature;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temp = new Temperature();
        System.out.print("Enter temperature in degrees Fahrenheit (°C): ");
        double inputDegree = scanner.nextDouble();

        temp.setCelsius(inputDegree);
        System.out.printf("The temperature in Fahrenheit degree = %.1f°F",temp.toFahrenheit());

        scanner.close();
    }
}
