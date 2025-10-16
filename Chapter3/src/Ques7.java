/*
        7. Write a program to convert centimeters (input) to feet and inches (output).
           1 in = 2.54 cm.
 */

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter centimeters: ");
        double centimeter = scanner.nextDouble();

        double feet = centimeter*0.032808;
        double inches = centimeter*0.393701;

        System.out.printf("%.2f(cm) = %.2f(inches) \n",centimeter,inches);
        System.out.printf("%.2f(cm) = %.2f(feet)\n",centimeter,feet);

        scanner.close();
    }
}
