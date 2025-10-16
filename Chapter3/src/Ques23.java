/*
    23. Dr. Caffeine’s Law of Program Readability states that the degree of program
    readability R (whose unit is mocha) is determined as
                                   CT²
                        R = k * ---------
                                    V³
    where k is Ms. Latte’s constant, C is the number of lines in the program that
    contain comments, T is the time spent (in minutes) by the programmer
    developing the program, and V is the number of lines in the program that
    contain nondescriptive variable names. Write an application to compute the
    program readability R. Ms. Latte’s constant is 2.5E2 mocha lines2/min2.
    (Note: This is just for fun. Develop your own law, using various functions from the Math class.)
 */
import java.util.Scanner;
public class Ques23 {
    public static void main(String[] args) {
        final double k = 2.5E2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines in the program that contain comments: ");
        int c = scanner.nextInt();

        System.out.print("Enter the time spent (in minutes) by the programmer developing the program: ");
        int t = scanner.nextInt();

        System.out.print("Enter the number of lines in the program that contain nondescriptive variable names: ");
        int v = scanner.nextInt();

        double R = k*((c*Math.pow(t,2))/Math.pow(v,3));
        System.out.printf("The program readability R is: %.2f", R);

        scanner.close();
    }
}
