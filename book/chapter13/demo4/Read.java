/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:32:36
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:32:36
 */
import java.io.*;
public class Read implements Runnable {
   DataInputStream in;
   public void setDataInputStream(DataInputStream in) {
      this.in = in;
   }
   public void run() {
      double result=0;
      while(true) {
        try{ result=in.readDouble();
             System.out.println("圆的面积:"+result);
             System.out.print("输入园的半径(放弃请输入N):");
        }
        catch(IOException e) { 
             System.out.println("与服务器已断开"+e);
             break;
        }   
      }
   }
}