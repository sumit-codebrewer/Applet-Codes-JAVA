package collegeFiles;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class PanelCalculator2 {
    String str="";
    String s1;
    int a,b,c=0;
    char ch;
    PanelCalculator2()
    {
        Font f2 = new Font("TimesRoman",Font.PLAIN,36); 
        Font f3 = new Font("Arial",Font.PLAIN,24);   
        Frame f1=new Frame("Panel Calculator");
        Panel p=new Panel();
        f1.setFont(f3);
        TextField tf=new TextField();
        tf.setPreferredSize(new Dimension(600,80));
        tf.setFont(f2);
        Button b1=new Button("1");
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="1";
                tf.setText(str);
            }
        });
        Button b2=new Button("2");
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="2";
                tf.setText(str);
            }
        });
        Button b3=new Button("3");
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="3";
                tf.setText(str);
            }
        });
        Button b4=new Button("+");
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ch='+';
                s1=tf.getText();
                tf.setText("");
                str="";
            }
        });
        Button b5=new Button("4");
        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="4";
                tf.setText(str);
            }
        });

        Button b6=new Button("5");
        b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="5";
                tf.setText(str);
            }
        });

        Button b7=new Button("6");
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="6";
                tf.setText(str);
            }
        });
        Button b8=new Button("-");
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ch='-';
                s1=tf.getText();
                tf.setText("");
                str="";
            }
        });
        Button b9=new Button("7");
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="7";
                tf.setText(str);
            }
        });
        Button b10=new Button("8");
        b10.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="8";
                tf.setText(str);
            }
        });
        Button b11=new Button("9");
        b11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="9";
                tf.setText(str);
            }
        });
        Button b12=new Button("*");
        b12.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ch='*';
                s1=tf.getText();
                tf.setText("");
                str="";
            }
        });
        Button b13=new Button("C");
        b13.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               tf.setText("");
               str="";
            }
        });

        Button b14=new Button("0");
        b14.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                str+="0";
                tf.setText(str);
            }
        });

        Button b15=new Button("=");
        b15.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String s2=tf.getText();
                tf.setText("");
                int b = 0;
                try {
                a=Integer.parseInt(s1);
                b=Integer.parseInt(s2);
                } catch (NumberFormatException f) {
                  tf.setText("NaN");
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
            tf.setText(String.valueOf(c));
            }
        });
        Button b16=new Button("/");
        b16.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ch='/';
                s1=tf.getText();
                tf.setText("");
                str="";
            }
        });
       f1.add(tf,BorderLayout.NORTH);
       p.add(b1); p.add(b2); p.add(b3); p.add(b4); p.add(b5); p.add(b6);
       p.add(b7); p.add(b8); p.add(b9); p.add(b10); p.add(b11); p.add(b12);
       p.add(b13); p.add(b14); p.add(b15); p.add(b16);
       f1.add(p);
       f1.setSize(600,600);
        f1.setBackground(Color.DARK_GRAY);
        f1.setVisible(true);
        p.setLayout(new GridLayout(4,4,10,10));
        

    }
    public static void main(String[] args)
    {
        new PanelCalculator2();
    }
}
