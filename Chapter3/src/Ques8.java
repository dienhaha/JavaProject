/*
        8. Write a program that inputs temperature in degrees Celsius and prints out the
        temperature in degrees Fahrenheit. The formula to convert degrees Celsius
        to equivalent degrees Fahrenheit is

                            Fahrenheit = 1.8 * Celsius + 32
 */

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        double tempC = scanner.nextDouble();

        double tempF = 1.8 * tempC + 32;

        System.out.printf("%.1f(°C) = %.1f(°F) \n",tempC,tempF);

        scanner.close();
    }

}
