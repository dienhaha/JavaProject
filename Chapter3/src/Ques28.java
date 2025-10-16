/*
    28. Develop an application that reads a purchase price and an amount tendered
        and then displays the change in dollars, quarters, dimes, nickels, and
        pennies. Two input values are entered in cents, for example, 3480 for $34.80
        and 70 for $0.70.

        Notice the input values are to be entered in cents (int data type), but
        the echo printed values must be displayed with decimal points (float data type).
 */
import java.util.Scanner;
public class Ques28 {
    public static void main(String[] args) {

        //DECLARE AND INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the purchase price(cents): ");
        int price = scanner.nextInt();
        System.out.print("Enter the amount tendered (>= purchase price): ");
        int amountTendered = scanner.nextInt();

        //COMPUTE
        int change = amountTendered - price;
        int dollar = change / 100;
        int quarter = (change % 100) / 25;
        int dime = ((change % 100) % 25) / 10;
        int nickel = (((change % 100) % 25) % 10) / 5;
        int penn = (((change % 100) % 25) % 10) % 5;


        //PRINT
        System.out.printf("%20s:    $%.2f \n", "Purchase Price", price / 100.0);
        System.out.printf("%20s:    $%.2f \n\n", "Amount Tendered", amountTendered / 100.0);
        System.out.printf("%20s:    $%.2f \n\n", " Your change is", change / 100.0);
        System.out.printf("%20s     %d %s \n", "", dollar, "one-dollar bill(s)");
        System.out.printf("%20s     %d %s \n", "", quarter, "quarter(s)");
        System.out.printf("%20s     %d %s \n", "", dime, "dime(s)");
        System.out.printf("%20s     %d %s \n", "", nickel, "nickel(s)");
        System.out.printf("%20s     %d %s \n\n", "", penn, "penn(y/ies)");
        System.out.println("Thank you for your business. Come back soon.");


        scanner.close();
    }
}
