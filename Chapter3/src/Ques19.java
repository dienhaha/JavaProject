/*
    19. Write a program that determines the number of days in a given semester.
    Input to the program is the year, month, and day information of the first and
    the last days of a semester. Hint: Create GregorianCalendar objects for the
    start and end dates of a semester and manipulate their DAY_OF_YEAR data.
 */
import java.util.Scanner;
import java.util.GregorianCalendar;
public class Ques19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input start date
        System.out.println("Enter start date of semester:");
        System.out.print("Year: ");
        int startYear = scanner.nextInt();
        System.out.print("Month (1-12): ");
        int startMonth = scanner.nextInt() - 1;  // GregorianCalendar months are 0-based
        System.out.print("Day: ");
        int startDay = scanner.nextInt();

        // Input end date
        System.out.println("Enter end date of semester:");
        System.out.print("Year: ");
        int endYear = scanner.nextInt();
        System.out.print("Month (1-12): ");
        int endMonth = scanner.nextInt() - 1;
        System.out.print("Day: ");
        int endDay = scanner.nextInt();

        // Create GregorianCalendar objects
        GregorianCalendar start = new GregorianCalendar(startYear, startMonth, startDay);
        GregorianCalendar end = new GregorianCalendar(endYear, endMonth, endDay);

        // Calculate difference in days
        long diffMillis = end.getTimeInMillis() - start.getTimeInMillis();
        long diffDays = diffMillis / (24 * 60 * 60 * 1000) + 1;

        System.out.println("Number of days in semester: " + diffDays);

        scanner.close();
    }
}
