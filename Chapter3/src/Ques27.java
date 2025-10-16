/*
    27. Ask the user to enter his or her birthday in the MM/DD/YYYY format and
    output the number of days between the birthday and today. This gives the
    person’s age in days.
 */

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ques27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar birthday2 = new GregorianCalendar();
        GregorianCalendar today = new GregorianCalendar();
        System.out.print("Enter your birthday (MM/dd/yyyy): ");
        String birthday = scanner.nextLine();

        String[] part = birthday.split("/");
        int month = Integer.parseInt(part[0]) - 1;        //month in Gregorian start at 0
        int day = Integer.parseInt(part[1]);
        int year = Integer.parseInt(part[2]);
        birthday2.set(year, month, day);

        long diffMillis = today.getTimeInMillis() - birthday2.getTimeInMillis();
        long ageInDays = diffMillis / (24 * 60 * 60 * 1000);

        System.out.println("Your age in days is: " + ageInDays);

        scanner.close();
    }
}
