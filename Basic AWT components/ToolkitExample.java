package collegeFiles;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class ToolkitExample  {
    public ToolkitExample() {
        Frame f=new Frame("Toolkit Example");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        Button b=new Button("Click me");
        b.setBounds(50,50,50,50);
        b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Toolkit.getDefaultToolkit().beep();
        }
        });
        f.add(b);
    }
    public static void main(String[] args)
    {
        new ToolkitExample();
    }

}
