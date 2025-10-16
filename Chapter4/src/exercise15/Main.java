package exercise15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DECLARE
        TotalPay totalPay;
        OrderDate orderDate;
        Bill bill;
        Scanner scanner = new Scanner(System.in);

        //INPUT
        System.out.print("Enter the number of coffee bags you want order: ");
        totalPay = new TotalPay(scanner.nextInt());

        System.out.println("The expected date of arrival is two weeks (14 days) from the date of order");
        System.out.print("Enter the order date (MM/dd/yyyy): ");
        scanner.nextLine(); //fix input \n buffer
        orderDate = new OrderDate(scanner.nextLine());

        //PRINT
        bill = new Bill();
        bill.setTotalPay(totalPay);
        bill.setOrderDate(orderDate);
        bill.getBill();

        scanner.close();
    }
}
