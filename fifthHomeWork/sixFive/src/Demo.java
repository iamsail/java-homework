import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame{
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(40,50,120,80);
        g.drawOval(40,50,120,80);
        g.drawOval(40,60,80,60);
        g.drawOval(40,70,60,40);
    }


    public static void main(String args[]){
        Demo test = new Demo();
        test.setTitle("Sail");
        test.setVisible(true);
        test.setSize(400,400);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
