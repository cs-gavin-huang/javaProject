/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:45:25
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:45:25
 */
public class Example12_2 { 
   public static void main(String args[]) { 
       Thread speakElephant;            //用Thread声明线程
       Thread speakCar;                 //用Thread声明线程
       ElephantTarget elephant;         //speakElephant线程的目标对象
       CarTarget car;                   //speakCar线程的目标对象
       elephant = new ElephantTarget();
       car = new CarTarget();
       speakElephant = new Thread(elephant) ;   //创建线程
       speakCar = new Thread(car);              //创建线程
       speakElephant.start();                    //启动线程 
       speakCar.start();                        //启动线程
       for(int i=1;i<=15;i++) {
          System.out.print("主人"+i+"  ");
       }  
   }
}
