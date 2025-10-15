/*
    24. Write a Java program that displays a frame window 300 pixels wide and
    200 pixels high with the title My First Frame. Place the frame so that its top
    left corner is at a position 50 pixels from the top of the screen and 100 pixels
    from the left of the screen. To position a window at a specified location, you
    use the setLocation method, as in
            //assume mainWindow is declared and created
              frame.setLocation( 50, 50 );
 */


import javax.swing.JFrame;

public class Ques24 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        myWindow.setSize(300, 200);
        myWindow.setTitle("My First Frame");
        myWindow.setVisible(true);
        myWindow.setLocation(100, 50);

        // x is horizontal location(set the distance from left screen to the WindowFrame),
        // y is vertical location(set the distance from top screen to the WindowFrame).
    }
}
