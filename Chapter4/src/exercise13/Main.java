package exercise13;

import java.util.Scanner;

//The main class will accept the total ticket and price for each type of seat

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seat seatA = new Seat();
        Seat seatB = new Seat();
        Seat seatC = new Seat();
        TotalSales totalSales = new TotalSales();

        System.out.print("Enter # of A seats: ");
        seatA.setNumberOfSeat(scanner.nextInt());
        System.out.print("Enter price($): ");
        seatA.setPrice(scanner.nextDouble());

        System.out.print("Enter # of B seats: ");
        seatB.setNumberOfSeat(scanner.nextInt());
        System.out.print("Enter price($): ");
        seatB.setPrice(scanner.nextDouble());

        System.out.print("Enter # of C seats: ");
        seatC.setNumberOfSeat(scanner.nextInt());
        System.out.print("Enter price($): ");
        seatC.setPrice(scanner.nextDouble());


        System.out.printf("%s $%.1f","Total sales is:",totalSales.getTotalSales(seatA,seatB,seatC));

        scanner.close();
    }
}
