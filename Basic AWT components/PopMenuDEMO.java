package appletPractice;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class PopMenuDEMO {

    public PopMenuDEMO() {
        Frame f=new Frame("Popmenu Example");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        PopupMenu p=new PopupMenu("Edit");
        MenuItem cut=new MenuItem("Cut");
        cut.setActionCommand("Cut");
        MenuItem copy=new MenuItem("Copy");
        copy.setActionCommand("Copy");
        MenuItem paste=new MenuItem("Paste");
        paste.setActionCommand("Paste");
        p.add(cut); p.add(copy); p.add(paste);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                p.show(f,e.getX(),e.getY());
            }
        });
        f.add(p);
    }
    public static void main(String[] args)
    {
        new PopMenuDEMO();
    }
    
}

