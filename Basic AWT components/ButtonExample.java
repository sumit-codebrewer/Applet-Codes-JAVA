package actionListener;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class ButtonExample {
    public static void main(String[] args)
    {
        Frame f=new Frame("Button Example");
        final TextField tf=new TextField();
        tf.setBounds(50,50,100,20);
        Button b=new Button("Click me");
        b.setBounds(50,100,70,70);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Hi,I am Sumit");
            }
        });
        f.add(tf); f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
