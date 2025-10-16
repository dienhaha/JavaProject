/*
    If you invest P dollars at R percent interest rate compounded annually, in
    N years, your investment will grow to
                        P*(1 + R/100)^N
    dollars. Write an application that accepts P, R, and N and computes the
    amount of money earned after N years.
 */

import java.util.Scanner;
public class Ques13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to invest in dollars($): ");
        int P = scanner.nextInt();
        System.out.print("Enter the interest rate compounded annually(%): ");
        double R = scanner.nextDouble();
        System.out.print("How long do you want (YEAR): ");
        int N = scanner.nextInt();

        double amount = P*(Math.pow(1+R/100,N));
        System.out.printf("You earn total $%.2f after %d years\n",amount,N);
        scanner.close();
    }
}
