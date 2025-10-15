/*
       28. Write a program that accepts a word and prints out the middle character.
           The length of the input word is odd. For example, if the input is magnificent,
           which has 11 characters, you output the sixth character f. You use the
           division operator /. This operator returns only
 */

import java.util.Scanner;

public class Ques28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word (The length of the input word is odd):");
        String input = scanner.next();
        //using next not nextLine because we need only single word.

        int middlePosition = input.length() / 2;
        //length is start at 1 but position is start at 0, so dividing by 2 gives the middle character of the word.

        char middleChar = input.charAt(middlePosition);
        System.out.println("The middle character is: " + middleChar);
        scanner.close();
    }
}
