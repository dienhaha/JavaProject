import java.util.Scanner;

/*
    The Nth Fibonacci number in the sequence can be evaluated with the formula

                Fₙ = (1 / √5) × [ ((1 + √5) / 2)ⁿ − ((1 − √5) / 2)ⁿ ]

    Write an application that accepts N and displays FN. Note that the result of
    computation using the Math class is double. You need to display it as an
    integer.
 */

public class Ques21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        double fibonacci = (1/Math.sqrt(5))*(Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5)/2)),n));
        long fibo = Math.round(fibonacci);
        System.out.printf("The %dth Fibonacci is: %d",n,fibo);
    }

}
