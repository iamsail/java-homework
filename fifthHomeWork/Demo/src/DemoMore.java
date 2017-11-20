import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("笑",50,50);
        g.drawOval(50,50,80,100);
        g.drawArc(70,80,14,7,0,180);
        g.drawArc(110,80,14,7,0,180);
        g.drawArc(70,110,40,20,180,180);
    }


    public static void main(String args[]){
        Demo test = new Demo();
        test.setTitle("笑");
        test.setSize(400,400);
        test.setLocation(100,100);
        test.setVisible(true);

//        Demo car = new Demo();
//        car.setTitle("哭");
//        car.setSize(400,400);
//        car.setLocation(600,100);
//        car.setVisible(true);
    }
}


