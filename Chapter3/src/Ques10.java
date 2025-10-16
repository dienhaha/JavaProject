import java.util.Scanner;

/*
    Write a program that does the reverse of Exercise 9, that is, input degrees
    Fahrenheit and prints out the temperature in degrees Celsius. The formula to
    convert degrees Fahrenheit to equivalent degrees Celsius is
                    Celsius = 5/9*(Fahrenheit - 32 )
 */
public class Ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        double tempF = scanner.nextDouble();

        double tempC = 5.0 / 9.0 * (tempF - 32);

        System.out.printf("%.1f(°F) = %.1f(°C) \n", tempF, tempC);

        scanner.close();
    }
}
