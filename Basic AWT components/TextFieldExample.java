package actionListener;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class TextFieldExample extends Frame implements ActionListener {
    TextField tf1,tf2,tf3;
    Button b1,b2;
    public TextFieldExample(){
        tf1=new TextField();
        tf1.setBounds(50,50,50,20);
        tf2=new TextField();
        tf2.setBounds(150,50,50,20);
        tf3=new TextField();
        tf3.setBounds(250,50,50,20);
        tf3.setEditable(false);
        b1=new Button("+");
        b1.setBounds(100,150,40,40);
        b2=new Button("-");
        b2.setBounds(200,150,40,40);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf1); add(tf2); add(tf3);
        add(b1); add(b2);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1)
        {
            c=a+b;
        }
        else if(e.getSource()==b2)
        {
            c=a-b;
        }
        String res=String.valueOf(c);
        tf3.setText(res);
    }
    public static void main(String[] args)
    {
        new TextFieldExample();
    }
}
