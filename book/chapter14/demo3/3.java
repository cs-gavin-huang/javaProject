/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:18:47
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:18:47
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
class MyCanvs extends JPanel { 
   public void paint(Graphics g) {
      Graphics2D g_2d=(Graphics2D)g;
       Ellipse2D ellipse= new Ellipse2D.Double(0,2,80,80);
       Rectangle2D rect=  new Rectangle2D.Double(40,2,80,80);
       Area a1=new Area(ellipse);  
       Area a2=new Area(rect);
       a1.intersect(a2);       //"与"
       g_2d.fill(a1);
       ellipse.setFrame(130,2,80,80); 
       rect.setFrame(170,2,80,80);
       a1=new Area(ellipse); 
       a2=new Area(rect);
       a1.add(a2);             //"或"
       g_2d.draw(a1);
       ellipse.setFrame(0,90,80,80);
       rect.setFrame(40,90,80,80);
       a1=new Area(ellipse);  
       a2=new Area(rect);
       a1.subtract(a2);        //"差"
       g_2d.draw(a1);
       ellipse.setFrame(130,90,80,80);
       rect.setFrame(170,90,80,80);
       a1=new Area(ellipse);  
       a2=new Area(rect);
       a1.exclusiveOr(a2);     //"异或"
       g_2d.fill(a1);
   }
}
public class Example14_3{
   public static void main(String args[]) {
      JFrame win = new JFrame();
      win.setSize(400,400);
      win.add(new MyCanvs());
      win.setVisible(true);    
   }     
}
