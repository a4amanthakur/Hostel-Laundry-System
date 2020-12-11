/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna_laundry;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author thakur-huni
 */
public class ConnectDB 
{
     Connection con=null;
     public Connection connect()
     {
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             this.con=  DriverManager.getConnection("jdbc:mysql://amans-webserver.cel7s2vhdev5.ap-south-1.rds.amazonaws.com:3306/krishnadb_new","amanthakuronly4u","$$Aman928");
             if(con!=null)
             {
                 System.out.println("Connection Established...");
             }
         }
         catch(Exception e)
         {
             System.out.println("Error in ConnectDB.java : "+e);
             
         }
         return this.con;
     }
     public void disconnect()
     {
         try
         {
             this.con.close();
             System.out.println("Connection Closed...");
         }
          catch(Exception e)
         {
             System.out.println("Error in ConnectDB.java : "+e);
             
         }
     }
     
  /*   public static void main(String ar[])
     {
         ConnectDB connectDb=new ConnectDB();
         connectDb.connect();
         connectDb.disconnect();
     }
   */
}
