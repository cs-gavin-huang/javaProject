/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:53:24
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:53:24
 */
public class Example12_9 {
   public static void main(String args[]) {
     ThreadJoin  a = new ThreadJoin();
     Thread customer = new Thread(a);
     Thread cakeMaker = new Thread(a);
     customer.setName("顾客");
     cakeMaker.setName("蛋糕师");
     a.setJoinThread(cakeMaker);
     customer.start();
   }
}
