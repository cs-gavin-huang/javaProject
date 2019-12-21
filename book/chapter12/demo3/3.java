/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:46:35
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:46:35
 */
public class Example12_3 {
   public static void main(String args[ ]) {
      House house = new House();
      house.setWater(10);
      Thread dog,cat;
      dog=new Thread(house); 
      cat=new Thread(house);  //cat和dog的目标对象相同 
      dog.setName("狗");
      cat.setName("猫"); 
      dog.start();
      cat.start();
   }
}
