/*
25. Because today’s computers are very fast, you will probably not notice any
discernible difference on the screen between the code
        JFrame myWindow;
        myWindow = new JFrame( );
        myWindow.setVisible( true );
    and
        JFrame myWindow;
        myWindow = new JFrame( );
        myWindow.setVisible( true );
        myWindow.setVisible( false );
        myWindow.setVisible( true );
One way to see the disappearance and reappearance of the window is to put
a delay between the successive setVisible messages. Here’s the magic code
that puts a delay of 0.5 s:
        try {Thread.sleep(500);} catch(Exception e) { }
The argument we pass to the sleep method specifies the amount of delay in
milliseconds [note: 1000 milliseconds (ms) = 1 second (s)]. We will not
explain this magic code.
 */

import javax.swing.*;

public class Ques25 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        myWindow.setSize(300, 200);
        try {Thread.sleep(1000);} catch(Exception e) { }
        myWindow.setVisible(true);
        try {Thread.sleep(1000);} catch(Exception e) { }
        myWindow.setVisible(false);
        try {Thread.sleep(1000);} catch(Exception e) { }
        myWindow.setVisible(true);

    }
}
