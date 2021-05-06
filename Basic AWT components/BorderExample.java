package collegeFiles;
import javax.swing.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class Border {
    Border()
    {
        JFrame f=new JFrame("Layout Demo");
        f.setSize(300,300);
        JButton b1=new JButton("North");
        JButton b2=new JButton("South");
        JButton b3=new JButton("East");
        JButton b4=new JButton("West");
        f.add(b1,"North");
        f.add(b2,"South");
        f.add(b3,"East");
        f.add(b4,"West");
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args)
    {
        new Border();
    }
}
