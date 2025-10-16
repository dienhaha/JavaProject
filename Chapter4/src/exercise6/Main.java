package exercise6;

import java.util.Scanner;

//The main class will accept the total ticket and price for each type of seat

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TotalSales totalSales = new TotalSales();

        System.out.print("Enter # of A seats: ");
        totalSales.setNumberOfA_Seats(scanner.nextInt());
        System.out.print("Enter price($): ");
        totalSales.setPricePerA_Seat(scanner.nextDouble());

        System.out.print("Enter # of B seats: ");
        totalSales.setNumberOfB_Seats(scanner.nextInt());
        System.out.print("Enter price($): ");
        totalSales.setPricePerB_Seat(scanner.nextDouble());

        System.out.print("Enter # of C seats: ");
        totalSales.setNumberOfC_Seats(scanner.nextInt());
        System.out.print("Enter price($): ");
        totalSales.setPricePerC_Seat(scanner.nextDouble());


        System.out.printf("%s $%.1f","Total sales is:",totalSales.getTotalSales());

        scanner.close();
    }
}
