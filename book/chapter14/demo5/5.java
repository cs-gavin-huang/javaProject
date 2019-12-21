/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:20:47
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:20:47
 */
import java.awt.*; 
import javax.swing.*; 
class Imagecanvas extends Canvas { 
    Toolkit tool;  
    Image image;
    Imagecanvas() {
       setSize(200,200);
       tool=getToolkit();               
       image=tool.getImage("鸭.jpg");
    }
    public void paint(Graphics g) {
        g.drawImage(image,10,10,image.getWidth(this),image.getHeight(this),this);
    }
}
public class Example14_5 {
   public static void main(String args[]) {
      JFrame win = new JFrame();
      Toolkit tool=win.getToolkit(); 
      Image image=tool.getImage("trian.jpg");
      win.setIconImage(image); 
      win.setSize(400,400);
      win.add(new Imagecanvas());
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      win.setVisible(true);    
   }     
}
