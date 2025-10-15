/*
    Problem Statement: Write a program that asks the user for her or his
    full name in the format:

                first middle last

    and replies with the name in the format:

                last , first middle-initial.

 */


import java.util.Scanner;

public class Ques35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (first middle last): ");
        String userFullName = scanner.nextLine();

        String firstName = userFullName.substring(0, userFullName.indexOf(" "));
        String remainName = userFullName.substring(userFullName.indexOf(" ") + 1, userFullName.length());

        String middleName = remainName.substring(0, remainName.indexOf(" "));
        char middleInitial = middleName.charAt(0);

        String lastName = remainName.substring(remainName.indexOf(" "), remainName.length());

        System.out.println("The name in format is: " + firstName + " " + middleInitial + ". " + lastName);
        scanner.close();
    }
}
