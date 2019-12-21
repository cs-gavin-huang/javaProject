/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:31:11
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:31:11
 */
import java.net.*; 
public class Example13_2 {
   public static void main(String args[]) {
      try{  InetAddress address_1=InetAddress.getByName("www.sina.com.cn");
           System.out.println(address_1.toString()); 
           InetAddress address_2=InetAddress.getByName("166.111.222.3");
           System.out.println(address_2.toString());
      }
      catch(UnknownHostException e) {
           System.out.println("无法找到 www.sina.com.cn");
      } 
   }
}


