/*
    17. Write a program that displays a frame window 800 pixels wide and 600 pixels
    high. Set the title of the frame to Welcome to Java.
 */

import javax.swing.JFrame;

public class Ques17 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle("Welcome to Java");
        myWindow.setVisible(true);
    }
}
