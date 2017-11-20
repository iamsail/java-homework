import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("哭",50,50);
        g.drawOval(50,50,80,100);
        g.drawArc(70,80,14,7,180,180);
        g.drawArc(110,80,14,7,180,180);
        g.drawArc(70,110,40,20,0d,180);
    }


    public static void main(String args[]){


        Demo car = new Demo();
        car.setTitle("哭");
        car.setSize(400,400);
        car.setLocation(600,100);
        car.setVisible(true);
    }
}


