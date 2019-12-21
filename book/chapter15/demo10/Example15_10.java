/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:13:33
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:13:33
 */
import java.util.*;
public class Example15_10 {
   public static void main(String args[]) {
      ArrayList<Integer> list=new ArrayList<Integer>();
      for(int i=0;i<10;i++) {
         list.add(i);  
      }
      for(int k=list.size()-1;k>=0;k--) {
         int m=list.get(k); 
         System.out.printf("%3d",m);
      }
   }
}
