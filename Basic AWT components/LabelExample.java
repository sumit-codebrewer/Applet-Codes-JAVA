package actionListener;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Sumit CodeBrewer
 */
public class LabelExample extends Frame implements ActionListener {
    TextField tf;
    Label l;
    LabelExample()
    {
        tf=new TextField();
        tf.setBounds(50,50,140,20);
        Button b=new Button("Click");
        b.setBounds(50,150,50,50);
        l=new Label();
        l.setBounds(100,80,200,80);
        b.addActionListener(this);
        add(b); add(tf); add(l);
        setLayout(null);
        setVisible(true);
        setSize(400,400);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        l.setText(tf.getText());
    }
    public static void main(String[] args)
    {
        new LabelExample();
    }

}
