package appletPractice;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class ListAssignment{

    public ListAssignment() {
        Frame f=new Frame("List Assignment");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.GREEN);
        Font f1=new Font("TimesRoman",Font.BOLD,24);
        Font f2=new Font("Arial",Font.PLAIN,18);
        Label l1=new Label();
        l1.setBounds(100,80,70,30);
        l1.setText("Shop");
        l1.setFont(f1);
        List list1=new List(8,true);
        list1.setFont(f2);
        list1.setBounds(80,120,120,180);
        list1.add("Vegetables");
        list1.add("Milk");
        list1.add("Bread");
        list1.add("Cereal");
        list1.add("Fruits");
        list1.add("Coke");
        list1.add("Soft Drink");
        list1.add("Cheese");
        Label l2=new Label();
        l2.setBounds(420,80,70,30);
        l2.setText("Basket");
        l2.setFont(f1);
        List list2=new List(8,true);
        list2.setBounds(400,120,120,180);
        list2.setFont(f2);
        Button b1=new Button(">");
        b1.setFont(f1);
        b1.setBounds(275,140,50,50);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for(String item:list1.getSelectedItems())
                {
                    list1.remove(item);
                    list2.add(item);
                }   
            }
        });
        Button b2=new Button("<");
        b2.setFont(f1);
        b2.setBounds(275,210,50,50);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for(String item:list2.getSelectedItems())
                {
                    list2.remove(item);
                    list1.add(item);
                }   
            }
        });
        f.add(l1); f.add(list1);
        f.add(l2); f.add(list2);
        f.add(b1); f.add(b2);
        
    }
    public static void main(String[] args)
    {
        new ListAssignment();
    }
    
}
