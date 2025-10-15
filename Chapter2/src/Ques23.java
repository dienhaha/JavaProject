/*
    23. Display the current time in the title of a frame window using this format:
    12:45:43 PM. Refer to Table 2.1 for the necessary designator symbols.
 */


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

public class Ques23 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        Date toDay = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a.");

        myWindow.setSize(400, 400);
        myWindow.setTitle(sdf.format(toDay));
        myWindow.setVisible(true);
    }
}
