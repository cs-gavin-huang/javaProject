/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:30:29
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:30:29
 */
import java.net.*;
import java.io.*;
public class Look implements Runnable {
   URL url;
   public void setURL(URL url) {
      this.url=url;
   }
   public void run() {
      try { 
        InputStream in = url.openStream();
        byte [] b = new byte[1024];
        int n=-1;
        while((n=in.read(b))!=-1) {
           String str = new String(b,0,n);
           System.out.print(str);
        }
      }
      catch(IOException exp){}
   }
}