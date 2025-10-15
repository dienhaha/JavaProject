/*
    22. Write a program that displays a frame window W pixels wide and H pixels
    high. Use the Scanner to enter the values for W and H. The title of the frame
    is also entered by the user.
 */

import java.util.Scanner;
import javax.swing.JFrame;

public class Ques22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JFrame myWindow = new JFrame();

        System.out.print("Enter the values for W(width): ");
        int width = scanner.nextInt();

        System.out.print("Enter the values for H(height): ");
        int height = scanner.nextInt();

        //because input buffer the nextLine will read the \n remain from the nextInt before and this is the solution
        scanner.nextLine();

        System.out.print("Enter the title: ");
        String title = scanner.nextLine();

        myWindow.setSize(width, height);
        myWindow.setTitle(title);
        myWindow.setVisible(true);

        scanner.close();
    }
}
