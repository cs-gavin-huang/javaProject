/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:33:45
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:33:45
 */
import java.net.*;
public class ReceiveLetterForLi implements Runnable {
   public void run() {
      DatagramPacket pack=null;
      DatagramSocket postman=null;
      byte data[]=new byte[8192];
      try{  pack=new DatagramPacket(data,data.length);
            postman = new DatagramSocket(666);
      }
      catch(Exception e){} 
      while(true) {  
        if(postman==null) break;
        else
          try{ postman.receive(pack); 
               String message=new String(pack.getData(),0,pack.getLength());
               System.out.printf("%25s\n","收到:"+message);
          }
          catch(Exception e){}
      } 
   }
}
