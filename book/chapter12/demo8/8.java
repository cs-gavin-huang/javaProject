/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:52:35
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:52:35
 */
public class Example12_8 {
   public static void main(String args[ ]) {
      TicketHouse officer = new TicketHouse();
      Thread zhangfei,likui;
      zhangfei = new Thread(officer); 
      zhangfei.setName("张飞");
      likui = new Thread(officer);  
      likui.setName("李逵");
      zhangfei.start();
      likui.start();
   }
}
