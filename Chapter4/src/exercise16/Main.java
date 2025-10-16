package exercise16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeBag coffeBag = new CoffeBag();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit weight of a bag of coffee(pound): ");
        coffeBag.setUnitWeight(scanner.nextDouble());

        System.out.print("Enter the number of bags sold: ");
        coffeBag.setNumberWeight(scanner.nextInt());

        System.out.printf("%20s:    %d\n", "Number of bag sold", coffeBag.numberOfUnits);
        System.out.printf("%20s:    %.2f (lb)\n", "Weight per bag", coffeBag.unitWeight);
        System.out.printf("%20s:    $%.2f\n", "Price per pound", coffeBag.PRICE);
        System.out.printf("%20s:    %.2f%%\n\n", "Sales tax", coffeBag.SALES_TAX*100);
        System.out.printf("%20s:    $%.3f\n", "Total price", coffeBag.getTotalPriceWithTax());

        scanner.close();
    }
}
