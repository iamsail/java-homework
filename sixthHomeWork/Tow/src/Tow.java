import java.awt.*;
import java.awt.event.*;

public class Tow extends Frame implements ActionListener,Runnable{

    static Label l1,l2;
    static Button btn1;
    static Button btn2;
    static boolean bool;
    public static int a = 10;
    public static int b = 200;

    public Tow(String name){
        super(name);
    }

    public Tow(){
        super();
    }

    public void settings(){
        this.setLayout(null);
        this.setBounds(200,200,300,150);
        l1 = new Label("向右移动标签");
        l1.setBounds(10,30,80,20);
        l2 = new Label("向左移动标签");
        l2.setBounds(200,60,80,20);

        btn1 = new Button("向右走");
        btn1.setBounds(50,100,80,20);

        btn2 = new Button("向左走");
        btn2.setBounds(150,100,80,20);

        add(l1);
        add(l2);
        add(btn1);
        add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }


    public static void main(String args[]){
        Tow demo = new Tow("移动标签");
        demo.settings();
        demo.setVisible(true);
    }

    public void run(){
        if(bool){
            for(int i = 0; i< 10; i++){
                try {
                    l1.setBounds(a,30,80,20);
                    a+=10;
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e.toString());
                }
            }
        }else{
            for(int i = 0; i< 10; i++){
                try {
                    l2.setBounds(b,30,80,20);
                    b-=10;
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e.toString());
                }
            }
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
            Thread first = new Thread(new Tow());
            bool = true;
            first.start();
        }

        if(e.getSource() == btn2){
            Thread second = new Thread(new Tow());
            bool = false;
            second.start();
        }
    }
}





