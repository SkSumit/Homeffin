
package homeScreen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//Class Creation
public class Databaseconn {
      private Connection conn;
      private Statement stat;
    //Constructor
    public Databaseconn() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/homeffins";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url,user,password);
            stat = conn.createStatement();
            System.out.println("Connection Successfull");
            System.out.println(stat);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Function
        public Statement getStat(){
            return stat;
        }
        
        
    }
    

