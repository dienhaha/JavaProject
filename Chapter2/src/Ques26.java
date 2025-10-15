/*
    26. Using the Scanner, input a string that contains a single exclamation mark.
    Divide the input string into two strings, one before and the other after the
    exclamation mark, and output them. Do not include the exclamation mark in
    the output. For example, if the input string is one potato two potato !three,
    then the output would be

        one potato two potato
        three
 */

import java.util.Scanner;
import java.lang.String;

public class Ques26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String contains a single exclamation mark(!): ");
        String string = scanner.nextLine();

        String subS1 = string.substring(0, string.indexOf("!"));
        String subS2 = string.substring(string.indexOf("!") + 1, string.length());

        System.out.println("This is the output:\n" + subS1 + "\n" + subS2);
        scanner.close();
    }
}
