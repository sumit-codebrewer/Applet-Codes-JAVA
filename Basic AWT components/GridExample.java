package collegeFiles;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class GridExample{
    GridExample()
    {
        Frame f=new Frame("Grid Example");
        f.setSize(400,400);
        f.setVisible(true);
        Button b[]=new Button[9];
        b[0]=new Button("1");
          b[1]=new Button("2");
            b[2]=new Button("3");
              b[3]=new Button("4");
                b[4]=new Button("5");
                  b[5]=new Button("6");
                    b[6]=new Button("7");
                      b[7]=new Button("8");
                        b[8]=new Button("9");
        for(int i=0;i<9;i++)
        {
            f.add(b[i]);
        }
        f.setLayout(new GridLayout(3,3));
    }
    public static void main(String[] args)
    {
        new GridExample();
    }
    
}
