/*
    16. Your weight is actually the amount of gravitational attraction exerted on
    you by the Earth. Since the Moon’s gravity is only one-sixth of the Earth’s
    gravity, on the Moon you would weigh only one-sixth of what you weigh on
    Earth. Write a program that inputs the user’s Earth weight and outputs her or
    his weight on Mercury, Venus, Jupiter, and Saturn. Use the values in this
    table.

    +---------+--------------------+
    | Planet  | Multiply the       |
    |         | Earth Weight by    |
    +---------+--------------------+
    | Mercury | 0.4                |
    | Venus   | 0.9                |
    | Jupiter | 2.5                |
    | Saturn  | 1.1                |
    +---------+--------------------+

 */

import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        final double MERCURY = 0.4, VENUS = 0.9, JUPITER = 2.5, SATURN = 1.1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight on Earth(kg): ");
        double userWeight = scanner.nextDouble();

        System.out.printf("Your weight on Mercury is %.2f   (kg)\n",userWeight*MERCURY);
        System.out.printf("Your weight on Venus   is %.2f   (kg)\n",userWeight*VENUS);
        System.out.printf("Your weight on Jupiter is %.2f   (kg)\n",userWeight*JUPITER);
        System.out.printf("Your weight on Saturn  is %.2f   (kg)\n",userWeight*SATURN);
        scanner.close();
    }
}
