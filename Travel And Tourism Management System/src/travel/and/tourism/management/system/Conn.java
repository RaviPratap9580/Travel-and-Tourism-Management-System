
package travel.and.tourism.management.system;

import java.sql.*;
public class Conn {
    
    Connection c;  
    Statement s;
    Conn(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "@Ravi9580");

          s=c.createStatement();
          
      }catch(Exception e){
          e.printStackTrace();
      }
    }
}
