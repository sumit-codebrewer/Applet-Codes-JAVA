package appletPractice;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class ScrollBarExample{

    public ScrollBarExample() {
        Frame f=new Frame("Scrollbar Example");
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        Scrollbar s=new Scrollbar();
        s.setBounds(100,100,50,100);
        f.add(s); f.add(l);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("Vertical scrollbar value:"+s.getValue());
            }
        });
    }
    public static void main(String[] args)
    {
        new ScrollBarExample();
    }
    
}

