/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:28:18
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:28:18
 */
import java.rmi.*;
public class ClientApplication{
   public static void main(String args[]){
      try{
         Remote  remoteObject=Naming.lookup("rmi://127.0.0.1/rect");
         RemoteSubject remoteSubject= (RemoteSubject)remoteObject;
         remoteSubject.setWidth(129);
         remoteSubject.setHeight(528);
         double area=remoteSubject.getArea(); 
         System.out.println("面积:"+area);
      }
      catch(Exception exp){
         System.out.println(exp.toString());
      }
   }
}
