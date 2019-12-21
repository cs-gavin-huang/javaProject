/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 01:20:34
 * @LastEditors  : you-know-who-2017
 * @LastEditTime : 2019-12-21 01:20:34
 */
public class Circle {
   double area,radius; 
   Circle(double r) {
      radius=r;
   } 
   public String toString() { //重写Object类的toString()方法
      area=radius*radius*Math.PI;
      return ""+area;
   }
}
