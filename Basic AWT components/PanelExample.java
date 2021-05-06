package collegeFiles;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class PanelExample {
    public PanelExample() {
        Frame f=new Frame("Panel Example");
        Panel p=new Panel();
        p.setBounds(40,80,200,200);
        p.setBackground(Color.gray);
        Button b1=new Button("Button1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);
        Button b2=new Button("Button2");
        b2.setBounds(90,100,80,30);
        b2.setBackground(Color.green);
        p.add(b1); p.add(b2);
        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new PanelExample();
    }
    
}
