/*
    27. Write a program that accepts a string input and outputs the number of
    characters in the string and the first and last character in separate lines. For
    example, if the input is I like Java then the output would be
 */

import java.util.Scanner;

public class Ques27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int numberChar = inputString.length();
        char firstChar = inputString.charAt(0);
        char lastChar = inputString.charAt(inputString.length() - 1);

        System.out.println(numberChar + "\n" + firstChar + "\n" + lastChar);

        scanner.close();
    }
}
