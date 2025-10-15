/*
    Problem Statement: Write a program that asks the user for his or her birth
    of date and replies with the day of the week on which he or she was born.
 */

//IMPORT STATEMENT
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Ques34 {
    public static void main(String[] args) {

        //DECLARE OBJECT
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        //INPUT
        System.out.print("Enter the Day you were born: ");
        int day = scanner.nextInt();
        System.out.print("Enter the Month: ");
        int month = scanner.nextInt() - 1; //Month in Gregorian start at 0 so must subtraction 1
        System.out.print("Enter the Year: ");
        int year = scanner.nextInt();

        //CREATE GREGORIAN CALENDAR
        GregorianCalendar userBirthday = new GregorianCalendar(year, month, day);

        //PRINT
        System.out.println("The day of the week you were born is " + sdf.format(userBirthday.getTime()));
        scanner.close();
    }
}
