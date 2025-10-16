package exercise10;

import java.util.Scanner;

public class Bicycler {
    public static void main(String[] args) {
        Student student = new Student();
        Bicycle ownerBicycle = new Bicycle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the owner name: ");
        String owner = scanner.nextLine();
        student.setName(owner);
        ownerBicycle.setOwnerName(student);

        System.out.println("The student owner bicycle is: " + ownerBicycle.getOwnerName());

        scanner.close();
    }

}
