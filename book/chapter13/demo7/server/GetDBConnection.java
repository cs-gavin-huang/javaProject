/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:38:36
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:38:36
 */
import java.sql.*; 
public class GetDBConnection {
   public static Connection connectDB(String DBName,String id,String p) {
      Connection con = null;
      String 
      uri = "jdbc:mysql://localhost:3306/"+DBName+"?useSSL=true&characterEncoding=utf-8";
      try{  Class.forName("com.mysql.jdbc.Driver");//加载JDBC-MySQL驱动
      }
      catch(Exception e){}
      try{  
         con = DriverManager.getConnection(uri,id,p); //连接代码
      }
      catch(SQLException e){}
      return con;
   }
}
