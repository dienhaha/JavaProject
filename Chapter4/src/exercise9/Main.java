package exercise9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Enter outer radius of a Circular(m): ");
        circle.setCircleRadius(scanner.nextDouble());
        double outerArena=circle.getArena();

        System.out.print("Enter inner radius of a Circular(m): ");
        circle.setCircleRadius(scanner.nextDouble());
        double innerArena=circle.getArena();

        if (outerArena<=innerArena){
            System.out.println("Outer radius must greater than or equal to inner radius");
            return;
        }
        System.out.printf("Arena of a circular region : %.2f(m² )",outerArena - innerArena);

        scanner.close();
    }
}
