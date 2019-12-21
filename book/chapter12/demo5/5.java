/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:47:49
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:47:49
 */
public class Example12_5 {
   public static void main(String args[]) {
      Home home=new Home();
      Thread showTime=new Thread(home); 
      showTime.start();
   }
}

