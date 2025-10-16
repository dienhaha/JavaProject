/*
        11. Write a program that inputs the year a person is born and outputs the age of
        the person in the following format:
                             You were born in 1990 and will be (are) 18 this year.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year you were born: ");
        int bornYear = scanner.nextInt();

        GregorianCalendar thisYear = new GregorianCalendar();
        int age = thisYear.get(Calendar.YEAR) - bornYear;

        System.out.println("You were born in " + bornYear + " and will be (are) " + age + " this year.");

        scanner.close();
    }
}
