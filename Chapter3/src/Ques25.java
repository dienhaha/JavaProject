/*
    25. If the population of a country grows according to the formula

    where y is the population after x years from the reference year, then we can
    determine the population of a country for a given year from two census figures.
    For example, given that a country with a population of 1,000,000 in 1970 grows to 2,000,000 by 1990,
    we can predict the country’s population in the year 2000. Here’s how we do the computation.
    Letting x be the number of years after 1970, we obtain the constant c as 1,000,000 because

                            1,000,000 = ce^k0 = c
    Then we determine the value of k as
                            y = 1,000,000e^kx

    2,000,000
    ---------  =  e^(20k)
    1,000,000

    k = (1 / 20) * ln(2,000,000 / 1,000,000) ≈ 0.03466

    Finally we can predict the population in the year 2000 by substituting
    0.03466 for k and 30 for x (2000 − 1970 = 30). Thus, we predict

    y = 1,000,000 * e^(0.03466 * 30) ≈ 2,828,651

    as the population of the country for the year 2000.

    Write an application that accepts five input values:
    - year A
    - population in year A
    - year B
    - population in year B
    - year C

    and predict the population for year C.
*/
import java.util.Scanner;
public class Ques25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Predict the population for year :");
        int yearC = scanner.nextInt();

        System.out.print("Enter year A: ");
        int yearA = scanner.nextInt();
        System.out.print("Enter the population of year A: ");
        int pA = scanner.nextInt();

        System.out.print("Enter year B: ");
        int yearB = scanner.nextInt();
        System.out.print("Enter the population of year B: ");
        int pB = scanner.nextInt();

        double k = 1.0/(yearB-yearA)*Math.log((double) pB/pA);
        double predict = pA*Math.exp(k*(yearC-yearA));

        System.out.printf("The population in %d is %.0f\n",yearC,predict);
        scanner.close();



    }
}
