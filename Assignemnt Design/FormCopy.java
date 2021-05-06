package appletPractice;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class FormCopy{
    String info="";
    char gender;
    String sub="";
    FormCopy()
    {
        Font f1 = new Font("TimesRoman",Font.BOLD,36);    
        Font f2 = new Font("Arial",Font.PLAIN,22);    
        Font f3 = new Font("Elephant",Font.PLAIN,18);
        Frame f=new Frame("Forms Copy");
        f.setSize(3000,3000);
        f.setVisible(true);
        f.setBackground(Color.LIGHT_GRAY);
        f.setFont(f1);
        f.setLayout(null);
        f.add(new MyCanvas());
        Label l=new Label();
        l.setBounds(530,30,400,30);
        l.setText("Welcome to Forms"); l.setFont(f1);
        f.setLayout(null);
        f.setVisible(true);
        Label l2=new Label();
        l2.setBounds(30,80,70,50);
        l2.setText("Name:"); f.setFont(f2);
        TextField tf1=new TextField();
        tf1.setBounds(120,90,200,30);
        Label l3=new Label();
        l3.setBounds(30,140,74,50);
        l3.setText("Choice of Subject:"); f.setFont(f2);
        Choice c=new Choice();
        c.setBounds(120,148,200,30);
        c.add("TOC");
        c.add("JAVA");
        c.add("BS");
        c.add("MATHEMATICS");
        c.add("OS");
        c.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                sub=c.getItem(c.getSelectedIndex());
            }
        });
        Label l4=new Label();
        l4.setBounds(30,205,80,50);
        l4.setText("Gender:"); f.setFont(f2);
        CheckboxGroup cb=new CheckboxGroup();
        Checkbox c1=new Checkbox("Male",cb,false);
        c1.setBounds(130,205,90,50);
        c1.addItemListener(new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent e)
           {
               if(e.getStateChange()==1)
               {
                   gender='m';
               }
           }
        });
        Checkbox c2=new Checkbox("Female",cb,false);
        c2.setBounds(230,205,90,50);
        c2.addItemListener(new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent e)
           {
               if(e.getStateChange()==1)
               {
                   gender='f';
               }
           }
        });
        TextArea t=new TextArea();
        t.setBounds(550,95,650,400);
        t.setEditable(false);
        Label l5=new Label();
        l5.setFont(f1);
        l5.setBounds(30,400,380,30);
        Button b=new Button("Submit");
        b.setFont(f2);
        b.setBounds(150,290,110,60);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                info="";
                if(gender=='m')
                {
                    info+=tf1.getText()+" is studying Btech and his favourite subject is "+sub;
                }
                else 
                {
                    info+=tf1.getText()+" is studying Btech and her favourite subject is "+sub;
                }
                t.setText(info);
                l5.setText("Your form is submitted!!!");
            }
        });
        f.add(l); f.add(l2); f.add(tf1); f.add(l3);
        f.add(c); f.add(l4); f.add(c1); f.add(c2);
        f.add(b); f.add(t); f.add(l5);
        
    }
    public static void main(String[] args)
    {
        new FormCopy();
    }
}
class MyCanvas extends Canvas{
    MyCanvas()
    {
        setBackground(Color.ORANGE);
        setBounds(0,550,1500,300);
    }
}
