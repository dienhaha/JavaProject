package question12;
import javax.swing.*;
import java.awt.*;
public class Tet {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        Graphics graphics;
        Container container;
        jFrame.setLocation(50, 50);
        jFrame.setVisible(true);
        jFrame.setTitle("Hello");
        jFrame.setSize(720, 480);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container = jFrame.getContentPane();
        container.setBackground(Color.CYAN);
        try {
            Thread.sleep(100);
            graphics = container.getGraphics();
            graphics.drawRect(50, 50, 200, 100);
            graphics.fillRect(50, 50 , 150, 90);

        }
        catch (InterruptedException _){
        }
    }
}
