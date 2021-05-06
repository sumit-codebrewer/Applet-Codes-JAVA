package collegeFiles;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */

public class BasicCalculator extends Frame implements ActionListener {
    TextField tf1;
    TextField tf2;
    TextField tf3;
    Button b1,b2,b3,b4,b5;
    Label l1,l2;
    int c;
    char ch;
    Main()
    {
        super("Calculator");
        tf1=new TextField();
        tf1.setBounds(30,100,80,20);
        l1=new Label();
        l1.setBounds(135,104,10,10);
        tf2=new TextField();
        tf2.setBounds(170,100,80,20);
        tf2.setEditable(false);
        l2=new Label();
        l2.setBounds(265,104,10,10);
        tf3=new TextField();
        tf3.setBounds(290,100,80,20);
        tf3.setEditable(false);
        b1=new Button("+");
        b1.setBounds(30,150,50,50);
        b2=new Button("-");
        b2.setBounds(110,150,50,50);
        b3=new Button("*");
        b3.setBounds(190,150,50,50);
        b4=new Button("/");
        b4.setBounds(270,150,50,50);
        b5=new Button("=");
        b5.setBounds(350,150,50,50);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                ch='+';
                l1.setText("+");
                tf2.setEditable(true);
            }
        });
       b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                ch='-';
                l1.setText("-");
                tf2.setEditable(true);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                ch='*';
                l1.setText("*");
                tf2.setEditable(true);
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                ch='/';
                l1.setText("/");
                tf2.setEditable(true);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String s1=tf1.getText();
                String s2=tf2.getText();
                int a = 0, b = 0;
                try {
                a=Integer.parseInt(s1);
                b=Integer.parseInt(s2);
                } catch (NumberFormatException f) {
                tf3.setText("NaN");
                return;
                }
                switch(ch)
            {
                case '+':c=a+b;
                    break;
                case '-':c=a-b;
                    break;
                case '*':c=a*b;
                    break;
                case '/':c=a/b;
                    break;
            }
                l2.setText("=");
                tf3.setText(String.valueOf(c));
            }
        });
        add(tf1); add(tf2); add(tf3);
        add(l1); add(l2);
        add(b1);  add(b2); add(b3); add(b4); add(b5);
        setSize(450,450);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        
    }
    public static void main(String[] args)
    {
        new BasicCalculator();
    }
   
}