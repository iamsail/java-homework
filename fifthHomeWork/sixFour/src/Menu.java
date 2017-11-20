import javax.swing.*;
import java.awt.*;

public class Menu {
    public static void main(String args[]){
        JFrame jFrame = new JFrame("我的菜单");

        JMenuBar mBar = new JMenuBar();
        jFrame.setJMenuBar(mBar);;

        JMenu menuOne = new JMenu("文体类");
        JMenu menuTow = new JMenu("计算机类");
        JMenu menuThree = new JMenu("帮助");

        menuOne.add(new JMenuItem("艺术欣赏"));
        menuOne.add(new JMenuItem("健美操"));
        menuOne.add(new JMenuItem("篮球"));


        menuTow.add(new JMenuItem("JAVA语言"));
        menuTow.add(new JMenuItem("网络编程"));


        menuThree.add(new JMenuItem("选课方法"));


        mBar.add(menuOne);
        mBar.add(menuTow);
        mBar.add(menuThree);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
    }
}

