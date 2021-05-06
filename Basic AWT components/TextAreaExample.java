package actionListener;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class TextAreaExample extends Frame implements ActionListener {
    Label l1,l2;
    Button b;
    TextArea area;
    TextAreaExample()
    {
        l1=new Label();
        l1.setBounds(50,50,100,30);
        l2=new Label();
        l2.setBounds(160,50,100,30);
        area=new TextArea();
        area.setBounds(20,100,300,300);
        b=new Button("Count words");
        b.setBounds(100,400,100,30);
        b.addActionListener(this);
        add(area); add(l1); add(l2); add(b);
        setSize(400,450);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String text=area.getText();
        String words[]=text.split(" ");
        l1.setText("Words:"+words.length);
        l2.setText("Characters:"+text.length());
    }
    public static void main(String[] args)
    {
        new TextAreaExample();
    }
}
