package actionListener;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class ChoiceDemo {
    ChoiceDemo(){
        Frame f=new Frame("Choice Demo");
        Button b=new Button("Click here");
        b.setBounds(300,140,70,50);
        Label l=new Label();
        l.setBounds(100,300,250,30);
        Choice c=new Choice();
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("Python");
        c.setBounds(50,150,200,30);
        f.setSize(400,400);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String s="Programming language choosed:"+c.getItem(c.getSelectedIndex());
                l.setText(s);
            }
        });
        f.add(c); f.add(b); f.add(l);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args)
    {
        new ChoiceDemo();
    }
}
