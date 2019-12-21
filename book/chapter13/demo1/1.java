/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:30:11
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:30:11
 */

import java.net.*;
import java.io.*;
import java.util.*;
public class Example13_1 {
   public static void main(String args[]) {
       Scanner scanner;
       URL url;
       Thread readURL;
       Look look = new Look();
       System.out.println("输入URL资源,例如:http://www.yahoo.com");
       scanner = new Scanner(System.in);
       String source = scanner.nextLine();
       try {  url = new URL(source);
              look.setURL(url);
              readURL = new Thread(look);
              readURL.start();
       }
       catch(Exception exp){
          System.out.println(exp);
       } 
   }
}

