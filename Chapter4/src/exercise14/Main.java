package exercise14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WeightConverter converter = new WeightConverter();

        System.out.print("Enter your weight on Earth(kg): ");
        double userWeight = scanner.nextDouble();

        System.out.printf("Your weight on MECURY is %.2f   (kg)\n",converter.mecuryWeight(userWeight));
        System.out.printf("Your weight on VENUS is %.2f   (kg)\n",converter.venusWeight(userWeight));
        System.out.printf("Your weight on JUPITER is %.2f   (kg)\n",converter.jupiterWeight(userWeight));
        System.out.printf("Your weight on SATURN is %.2f   (kg)\n",converter.saturnWeight(userWeight));
        scanner.close();
    }
}
