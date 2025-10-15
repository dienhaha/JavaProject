/*
    19. Input the user’s first, middle, and last name as three separate strings and
    display the name in the order of the first name, the middle initial, and the last
    name. Include the period after the middle initial. If the input strings are
    Wolfgang, Amadeus, and Mozart, for example, then the output would be
    Wolfgang A. Mozart. Use the console window for output.
 */

import java.util.Scanner;


public class Ques19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.printf("%s %s. %s. \n",firstName, middleName.charAt(0), lastName);

        scanner.close();
    }
}
