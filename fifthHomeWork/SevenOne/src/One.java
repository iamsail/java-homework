import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class One extends Frame implements ActionListener  {
    static TextField t=new TextField("您还没按我呢！",12);
    static int i;
    public static void main(String args[]){
        //actionPerformed();
        One f=new One();
        f.setLayout(new FlowLayout());
        f.setTitle("Press Me");
        Button b=new  Button(" Press Me ");
        b.addActionListener(f);
        f.add(t);
        f.add(b);
        f.setSize(170,100);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        t.setText("你点击了"+(++i)+"次");
    }
}
