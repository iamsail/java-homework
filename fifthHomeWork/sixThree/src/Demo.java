import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo(){
        setLayout(new GridLayout(4,1));
        getContentPane().add(new JTextField(""));
        getContentPane().add(new JTextField(""));
        JPanel jPanel = new JPanel();
        JButton button1,button2,button3,button4;
        button1 = new JButton("+");
        button2 = new JButton("-");
        button3 = new JButton("*");
        button4 = new JButton("/");
        button1.setForeground(Color.BLUE);
        button2.setForeground(Color.RED);
        button3.setForeground(Color.yellow);
        button4.setForeground(Color.black);

        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button4);
        getContentPane().add(jPanel);
        getContentPane().add(new JTextField(""));
    }

    public static void main(String args[]){
        Demo test = new Demo();
        test.setTitle("计算器");
        test.pack();
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setLocationRelativeTo(null);
    }
}
