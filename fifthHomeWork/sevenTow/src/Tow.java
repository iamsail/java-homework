
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;

import javax.swing.JFrame;

//import java.util.EventListener;

public class Tow extends Panel {
    public static Boolean change = true;
    public static int station = 1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ChangeFace");
        Tow two = new Tow();
        frame.add(two);
        frame.setSize(200, 200);
        frame.setVisible(true);d

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (change) {
            g2.setColor(Color.BLUE);
            g2.drawString("哭！", 20, 50);
            g2.drawOval(70, 60, 90, 100);
            g2.drawArc(80, 70, 24, 20, 225, 115);
            g2.drawArc(120, 70, 24, 20, 225, 115);
            g2.drawArc(85, 120, 45, 25, 0, 180);
        } else {
            // Graphics2D g2=(Graphics2D) g;
            g2.setColor(Color.BLUE);
            g2.drawString("笑！", 50, 40);
            g2.drawOval(70, 60, 90, 100);
            g2.drawArc(80, 80, 24, 20, 45, 115);
            g2.drawArc(120, 80, 24, 20, 45, 115);
            g2.drawArc(100, 110, 45, 25, 180, 100);
        }
    }

    public boolean mouseUp(Event e, int x, int y) {

        station++;
        if (station % 2 == 0) {
            change = false;
            repaint();
            return false;
        } else {
            change = true;
            repaint();
            return true;
        }

    }

}
