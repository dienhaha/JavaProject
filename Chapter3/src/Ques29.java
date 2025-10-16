/*
    29. MyJava Coffee Outlet runs a catalog business. It sells only one type of
    coffee beans, harvested exclusively in the remote area of Irian Jaya. The
    company sells the coffee in 2-lb bags only, and the price of a single 2-lb
    bag is $5.50. When a customer places an order, the company ships the
    order in boxes. The boxes come in three sizes: the large box holds 20 bags
    of 2 lb, the medium 10 bags, and the small 5 bags. The cost of a large
    box is $1.80; a medium box, $1.00; and a small box, $0.60. The order is
    shipped in the least expensive manner. For example, the order of 52 bags
    will be shipped in four boxes: two large, one medium, and one small. The
    rule for packing is to fill the large and medium boxes completely; that is,
    the box is fully packed. Only the small boxes can have empty spaces. For
    example, to ship 52 bags, you could have used 3 large boxes, but that
    would leave the third box not fully packed. Develop a program that
    computes the total cost of an order. Display the output in the following
    format:

                Number of Bags Ordered: 52 - $286.00

                Boxes Used:
                            2 Large  - $3.60
                            1 Medium - $1.00
                            1 Small  - $0.60

                Your total cost is: $291.20

 */

//  1 bag (2 lb) cost $5.50
// large box = $1.80 holds 20 bags
// medium box = $1.00 holds 10 bags
// small box = $0.60 holds 5 bags

import java.util.Scanner;

public class Ques29 {
    public static void main(String[] args) {
        //DECLARE
        Scanner scanner = new Scanner(System.in);
        final double PRICE = 5.50, LARGE_BOX = 1.80, MEDIUM_BOX = 1.00, SMALL_BOX = 0.60;

        //INPUT
        System.out.print("Enter the number of coffee bags you want order: ");
        int bags = scanner.nextInt();

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
        System.out.printf("Your total cost is:  $%.2f", totalPrice);

        scanner.close();
    }
}
