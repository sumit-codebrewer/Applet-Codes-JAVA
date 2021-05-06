package actionListener;

import java.awt.*;
import java.awt.event.*;
public class ListDemo  {
    ListDemo()
    {
        Frame f=new Frame("List Demo");
        Label l=new Label();
        l.setBounds(50,50,500,30);
        List l1=new List(4,false);
        l1.setBounds(60,100,100,100);
        l1.add("C");
        l1.add("C++");
        l1.add("Java");
        l1.add("Python");
        List l2=new List(4,true);
        l2.setBounds(250,100,100,100);
        l2.add("Spring");
        l2.add("Swing");
        l2.add("Django");
        l2.add("Maven");
        Button b=new Button("Click me");
        b.setBounds(170,200,60,50);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String lan="Programming language selected:"+l1.getItem(l1.getSelectedIndex());
                lan+=",Framework selected:";
                for(String f:l2.getSelectedItems())
                {
                    lan+=f+",";
                }
                l.setText(lan);
            }
        });
        f.add(l1); f.add(l2); f.add(b); f.add(l);
        f.setSize(700,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ListDemo();
    }
}
