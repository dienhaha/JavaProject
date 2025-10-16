/*
    24. Write a program that accepts the unit weight of a bag of coffee in pounds and
    the number of bags sold and displays the total price of the sale, computed as
            totalPrice = unitWeight * numberOfUnits * 5.99;
            totalPriceWithTax = totalPrice + totalPrice * 0.0725;
 */

import java.util.Scanner;
public class Ques24 {
    public static void main(String[] args) {
        final double PRICE = 5.99;
        final double SALES_TAX = 0.0725;

        Scanner scanner = new Scanner(System.in);
        double totalPrice,totalPriceWithTax,unitWeight;
        int numberOfUnits;

        System.out.print("Enter the unit weight of a bag of coffee(pound): ");
        unitWeight = scanner.nextDouble();

        System.out.print("Enter the number of bags sold: ");
        numberOfUnits = scanner.nextInt();

        totalPrice = unitWeight * numberOfUnits * PRICE;
        totalPriceWithTax = totalPrice + totalPrice * SALES_TAX;

        System.out.printf("%20s:    %d\n", "Number of bag sold", numberOfUnits);
        System.out.printf("%20s:    %.2f (lb)\n", "Weight per bag", unitWeight);
        System.out.printf("%20s:    $%.2f\n", "Price per pound", PRICE);
        System.out.printf("%20s:    %.2f%%\n\n", "Sales tax", SALES_TAX*100);
        System.out.printf("%20s:    $%.3f\n", "Total price", totalPriceWithTax);

        scanner.close();
    }
}
