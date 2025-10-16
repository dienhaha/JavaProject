/*
    20. Modify the Ch3FindDayOfWeek program by accepting the date information
    as a single string instead of accepting the year, month, and day information
    separately. The input string must be in the MM/dd/yyyy format. For
    example, July 4, 1776, is entered as 07/04/1776. There will be exactly two
    digits for the month and day and four digits for the year.
 */

import java.util.*;
import java.text.*;

public class Ques20 {
    public static void main(String[] args) throws ParseException {

        GregorianCalendar cal;
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("EEEE");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day in the format (MM/dd/yyyy): ");
        String inputDay = scanner.nextLine();

        String[] split = inputDay.split("/");
        int month = Integer.parseInt(split[0]) - 1;
        int day = Integer.parseInt(split[1]);
        int year = Integer.parseInt(split[2]);

        cal = new GregorianCalendar(year, month, day);
        System.out.println("");
        System.out.println("Day of Week: " + sdf.format(cal.getTime()));
    }
}
