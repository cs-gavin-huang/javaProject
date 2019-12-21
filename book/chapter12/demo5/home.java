/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:48:02
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:48:02
 */
import java.util.Date;
import java.text.SimpleDateFormat;
public class Home implements Runnable {
   int time=0;
   SimpleDateFormat m=new SimpleDateFormat("hh:mm:ss");
   Date date;
   public void run() {     
      while(true) {
        date=new Date();
        System.out.println(m.format(date));
        time++;
        try{ Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        if(time==3) {
          Thread thread=Thread.currentThread();
          thread=new Thread(this);
          thread.start();
        }
      }
   }
}

