package appletPractice;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class MenuBarExample  {

    public MenuBarExample() {
        Frame f=new Frame("Menubar Example");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("Menu");
        Menu subMenu=new Menu("Submenu");
        MenuItem i1=new MenuItem("Item1");
        MenuItem i2=new MenuItem("Item2");
        MenuItem i3=new MenuItem("Item3");
        MenuItem i4=new MenuItem("Item4");
        MenuItem i5=new MenuItem("Item5");
        menu.add(i1); menu.add(i2); menu.add(i3);
        subMenu.add(i4); subMenu.add(i5);
        menu.add(subMenu);
        mb.add(menu); 
        f.setMenuBar(mb);
    }
    public static void main(String[] args)
    {
        new MenuBarExample();
    }
    
}
