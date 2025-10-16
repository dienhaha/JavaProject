/*
    30. Repeat Exercise 29, but this time, accept the date when the order is placed
    and display the expected date of arrival. The expected date of arrival is two
    weeks (14 days) from the date of order. The order date is entered as a
    single string in the MM/dd/yyyy format. For example, November 1, 2008
    is entered as 11/01/2008. There will be exactly two digits each for the
    month and day and four digits for the year. Display the output in the
    following format:

            Number of Bags Ordered: 52 - $286.00
            Boxes Used:
                        2 Large  - $3.60
                        1 Medium - $1.00
                        1 Small  - $0.60
            Your total cost is: $291.20

            Date of Order:             November 1, 2008
            Expected Date of Arrival:  November 15, 2008
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Ques30 {
    public static void main(String[] args) {
        //DECLARE
        Scanner scanner = new Scanner(System.in);
        final double PRICE = 5.50, LARGE_BOX = 1.80, MEDIUM_BOX = 1.00, SMALL_BOX = 0.60;
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");

        //INPUT
        System.out.print("Enter the number of coffee bags you want order: ");
        int bags = scanner.nextInt();

        System.out.println("The expected date of arrival is two weeks (14 days) from the date of order");
        System.out.print("Enter the order date (MM/dd/yyyy): ");
        scanner.nextLine(); //fix input \n buffer
        String orderDate = scanner.nextLine();

        String[] part = orderDate.split("/");
        int month = Integer.parseInt(part[0]) - 1;        //month in Gregorian start at 0
        int day = Integer.parseInt(part[1]);
        int year = Integer.parseInt(part[2]);

        //get Order Date
        GregorianCalendar orderDate1 = new GregorianCalendar();
        orderDate1.set(year, month, day);
        //add 14 days of delivery
        GregorianCalendar orderDate2 = new GregorianCalendar();
        orderDate2.set(year, month, day);
        orderDate2.add(Calendar.DAY_OF_YEAR, 14);


        //COMPUTE
        double coffeePrice = bags * PRICE;

        int largeUsed = bags / 20;
        double largePrice = largeUsed * LARGE_BOX;

        int mediumUsed = (bags % 20) / 10;
        double mediumPrice = mediumUsed * MEDIUM_BOX;

        int smallUsed = Math.ceilDiv(((bags % 20) % 10), 5);
        double smallPrice = smallUsed * SMALL_BOX;

        double totalPrice = coffeePrice + largePrice + mediumPrice + smallPrice;

        //PRINT
        System.out.printf("Number of Bags Ordered: %d - $%.2f\n", bags, coffeePrice);
        System.out.print("Box Used:\n");
        System.out.printf("         %d %-6s - $%.2f\n", largeUsed, "Large", largePrice);
        System.out.printf("         %d %-6s - $%.2f\n", mediumUsed, "Medium", mediumPrice);
        System.out.printf("         %d %-6s - $%.2f\n", smallUsed, "Small", smallPrice);
        System.out.printf("Your total cost is:  $%.2f\n", totalPrice);
        System.out.println("Date of Order:              " + sdf.format(orderDate1.getTime()));
        System.out.println("Expected Date of Arrival:   " + sdf.format(orderDate2.getTime()));

        scanner.close();
    }
}
