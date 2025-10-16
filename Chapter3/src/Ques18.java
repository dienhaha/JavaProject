/*
       18. Write a program to solve quadratic equations of the form

            Ax² + Bx + C = 0

        where the coefficients A, B, and C are real numbers.
        The two real number solutions are derived by the formula:

            x = [ -B ± √(B² - 4AC) ] / (2A)

        For this exercise, you may assume that A ≠ 0 and the relationship

            B² ≥ 4AC

        holds, so there will be real number solutions for x.
 */

import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of A(A≠ 0): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of B: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of C: ");
        double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(d))/ (2 * a);
        double x2 = (-b - Math.sqrt(d))/ (2 * a);

        System.out.printf("The solution of equation is:\n \t\tx1 = %.2f\tx2 = %.2f", x1, x2);

        scanner.close();
    }
}
