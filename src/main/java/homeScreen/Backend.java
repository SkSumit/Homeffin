
package homeScreen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Backend {
    public Backend(){
        System.out.println("Hello & Welcome to Constructor");
    }
    
    public int Register(JTextField jTextField1,JTextField jTextField2,JTextField jTextField3,JTextField jTextField4,JTextField jTextField5,JTextField jTextField6,JComboBox jComboBox1){
        String Fname = jTextField1.getText();
        String Lname = jTextField2.getText();
        String mobStr = jTextField3.getText();
        String email = jTextField4.getText();
        String pass = jTextField5.getText();
        String confpasas = jTextField6.getText();
        Object gender =  jComboBox1.getSelectedItem();
        String realgender = gender.toString();
        String insert = "INSERT INTO Users(FirstName , LastName , Mobile , Gender , Email , Pass) VALUES ('"+Fname+"' , '"+Lname+"' , '"+mobStr+"' , '"+realgender+"' , '"+email+"', SHA('"+pass+"'))";
        String select = "SELECT Email FROM USERS WHERE Email = '"+email+"'";
        Databaseconn db = new Databaseconn(); // Creating object of class type Databaseconn
        Statement stat = db.getStat();

        try {
            ResultSet exist = stat.executeQuery(select);
            if(exist.next()){
                System.out.println("Record already exist");
                return 0;
            }
            else{
                stat.executeUpdate(insert);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 1;
    }
}
