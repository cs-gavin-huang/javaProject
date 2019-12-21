/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:42:08
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:42:08
 */
public class SpeakCar extends Thread {
   public void run() {
      for(int i=1;i<=20;i++) {
         System.out.print("轿车"+i+"  ");
      }  
   } 
}
