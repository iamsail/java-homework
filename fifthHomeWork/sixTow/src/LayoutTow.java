import javax.swing.*;
import java.awt.*;

public class LayoutTow extends JFrame {
    private JLabel jLabel;

    public static void main(String args[]){
        LayoutTow one = new LayoutTow();
        one.setVisible(true);
    }

    public LayoutTow(){
        setLayout(new FlowLayout());

        setResizable(true);
        setSize(300,300);
        setLocation(200,500);

        jLabel = new JLabel();
        jLabel.setText("有标签的");
        jLabel.setBounds(20,20,20,20);
        add(jLabel);
        setVisible(true);
    }
}
