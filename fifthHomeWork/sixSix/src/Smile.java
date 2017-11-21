package com.cumt.lab06_06;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Smile {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
            EventQueue.invokeLater(new Runnable(){
                public void run(){
                    DrawFrame1 fram=new DrawFrame1();
                    fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    fram.setVisible(true);
                }
            });
    }

}
class DrawFrame1 extends JFrame{
    public DrawFrame1(){
        setTitle("Smile");
        setSize(D_W,D_H);
        DrawPanel dp=new DrawPanel();
        add(dp);
    }
    public static final int D_W=400;
    public static final int D_H=400;
}
class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.drawString("SMILE", 50, 40);
        g2.drawOval(70, 60, 90, 100);
        g2.drawArc(80, 80, 24, 20, 45, 115);
        g2.drawArc(120, 80, 24, 20, 45, 115);
        g2.drawArc(100, 110, 45, 25, 180, 100);

    }

}


