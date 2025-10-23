package question12;
import java.awt.*;
import javax.swing.*;
public class ScrollingText extends JPanel {
        private String message = "Welcome to Java Screensaver!";
        private int x = 720;  // bắt đầu từ mép phải
        private int y = 200;
        private int speed = 5;

        public ScrollingText() {
            setBackground(Color.BLACK);
            setForeground(Color.YELLOW);

            // Timer để update vị trí
            Timer timer = new Timer(20, e -> {
                x -= speed;
                if (x + getFontMetrics(getFont()).stringWidth(message) < 0) {
                    x = getWidth(); // chạy lại từ phải
                }
                repaint();
            });
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.setColor(getForeground());
            g.drawString(message, x, y);
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Scrolling Text Screensaver");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(720, 480);
            frame.add(new ScrollingText());
            frame.setVisible(true);
        }
}

