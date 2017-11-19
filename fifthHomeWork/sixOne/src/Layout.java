import javax.swing.*;
import java.awt.*;

public class Layout {
    public static void main(String args[]){
        JFrame jFrame = new JFrame();
        jFrame.setTitle("学习布局");
        jFrame.setResizable(true);
        jFrame.setSize(300,300);
        jFrame.setLocation(200,500);
        jFrame.setLayout(new FlowLayout());
        Button btnOne = new Button("FlowLayout框架");
        jFrame.add(btnOne);
        jFrame.setVisible(true);
//      ================================================
        JFrame towFrame = new JFrame();

        towFrame.setTitle("学习布局");
        towFrame.setResizable(true);
        towFrame.setSize(300,300);
        towFrame.setLocation(500,500);
        towFrame.setLayout(new BorderLayout());
        Button btnTow = new Button("BorderLayout布局");
        btnTow.setSize(new Dimension(20,50));
        towFrame.add(btnTow);
        towFrame.setVisible(true);
//      ================================================
        JFrame threeFrame = new JFrame();

        threeFrame.setTitle("学习布局");
        threeFrame.setResizable(true);
        threeFrame.setSize(300,300);
        threeFrame.setLocation(800,500);
        threeFrame.setVisible(true);
        threeFrame.setLayout(new GridLayout(3,3));
        Button btnThree = new Button("GridBagLayout布局");
        threeFrame.add(btnThree);

    }
}



