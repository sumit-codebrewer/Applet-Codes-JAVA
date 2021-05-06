package actionListener;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class CheckBoxExample {
    CheckBoxExample()
    {
        Frame f=new Frame("CheckBox Example");
        Checkbox ch1=new Checkbox("C++");
        ch1.setBounds(50,50,50,50);
        Label l1=new Label();
        l1.setBounds(150,60,300,30);
        Checkbox ch2=new Checkbox("Java");
        ch2.setBounds(50,100,50,50);
        Label l2=new Label();
        l2.setBounds(150,110,300,30);
        ch1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                l1.setText("C++ Checkbox:"+(e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        ch2.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                l2.setText("Java Checkbox:"+(e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        f.setSize(500,500);
        f.add(ch1); f.add(ch2); f.add(l1); f.add(l2);
        f.setLayout(null);
        f.setVisible(true);    
    }
    public static void main(String[] args)
    {
        new CheckBoxExample();
    }
    
}
