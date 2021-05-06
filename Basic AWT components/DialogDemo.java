package collegeFiles;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class DialogDemo {
    private static Dialog d;
    public DialogDemo() {
        Frame f=new Frame("Dialog Example");
        d=new Dialog(f,"Dialog Example",true);
        d.setLayout(new FlowLayout());
        Button b=new Button("OK");
        b.addActionListener(new ActionListener(){
           @Override 
           public void actionPerformed(ActionEvent e)
           {
               DialogDemo.d.setVisible(false);
           }
        });
        d.add(new Label("Click button to continue"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
//        f.setVisible(true);
//        f.setLayout(null);
//        f.setSize(400,400);
    }
    public static void main(String[] args)
    {
        new DialogDemo();
    }
    
}
