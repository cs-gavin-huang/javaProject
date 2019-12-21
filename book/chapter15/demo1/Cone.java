/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 01:21:48
 * @LastEditors  : you-know-who-2017
 * @LastEditTime : 2019-12-21 01:22:06
 */
public class Cone<E> { 
   double height;
   E bottom;           //用泛型类E声明对象bottom
   public Cone (E b) {
      bottom=b;   
   }
   public void setHeight(double h) {
      height=h;
   }
   public double computerVolume() {
      String s=bottom.toString();  //泛型变量只能调用从Object类继承的或重写的方法
      double area=Double.parseDouble(s); 
      return 1.0/3.0*area*height; 
   }
}
