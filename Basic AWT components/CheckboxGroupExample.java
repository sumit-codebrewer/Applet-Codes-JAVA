package actionListener;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Sumit CodeBrewer
 */
public class CheckboxGroupExample {

    public CheckboxGroupExample() {
        Frame f=new Frame("Checkbox Group Example");
        Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        CheckboxGroup c=new CheckboxGroup();
        Checkbox c1=new Checkbox("C++",c,false);
        c1.setBounds(100,100,50,50);
        Checkbox c2=new Checkbox("Java",c,false);
        c2.setBounds(100,150,50,50);
        f.setSize(500,500);
        c1.addItemListener(new ItemListener(){
            @Override
           public void itemStateChanged(ItemEvent e){
               l.setText("C++ checkbox clicked");
           } 
        });
         c2.addItemListener(new ItemListener(){
            @Override
           public void itemStateChanged(ItemEvent e){
               l.setText("Java checkbox clicked");
           } 
        });
        f.add(c1); f.add(c2); f.add(l);
        f.setLayout(null);
        f.setVisible(true);        
    }
    public static void main(String[] args)
    {
        new CheckboxGroupExample();
    }
    
    
}