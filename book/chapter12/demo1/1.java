/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:41:28
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:41:28
 */
public class Example12_1 { 
   public  static void main(String args[]) { //主线程
       SpeakElephant  speakElephant;
       SpeakCar  speakCar;  
       speakElephant = new SpeakElephant() ;      //创建线程
       speakCar = new SpeakCar();                //创建线程
       speakElephant.start();                          //启动线程 
       speakCar.start();                         //启动线程
       for(int i=1;i<=15;i++) {
          System.out.print("主人"+i+"  ");
       }  
   }
}
