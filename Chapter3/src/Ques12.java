/*
    12. A quantity known as the body mass index (BMI) is used to calculate the risk
    of weight-related health problems. BMI is computed by the formula

                        BMI = w/(h/100.00)²

    where w is weight in kilograms and h is height in centimeters. A BMI of
    about 20 to 25 is considered “normal.” Write an application that accepts
    weight and height (both integers) and outputs the BMI.
 */

import java.util.Scanner;


public class Ques12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight(kg): ");
        int weight = scanner.nextInt();
        System.out.print("Enter your height(cm): ");
        int height = scanner.nextInt();

        double bmi = weight/Math.pow(height/100.00,2);

        System.out.printf("Your BMI = %.1f\n",bmi);

        scanner.close();
    }
}
