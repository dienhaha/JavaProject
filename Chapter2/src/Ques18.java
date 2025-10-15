
/*
    18. Input the user’s first and last name as two separate strings. Then display a
    frame window with its title set to <last>, <first>, where <last> and <first> are
    the input values. For example, if the input values are Johann and Strauss,
    then the title would be Strauss, Johann.
 */

import java.util.Scanner;
import javax.swing.JFrame;

public class Ques18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JFrame myWindow = new JFrame();

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        myWindow.setSize(800, 600);
        myWindow.setTitle(lastName + ", " + firstName);
        myWindow.setVisible(true);

        scanner.close();
    }
}
