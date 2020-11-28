package homeScreen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Databaseconn {

    private Connection conn;
    private Statement statement;
    private PreparedStatement ps;
    private String connectionUsername = "root";
    private String connectionPassword = "";
    private String databaseName = "homeffins";

    //SQL QUERIES
    //Constructor and Innitialization
    public Databaseconn() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName + "",
                    connectionUsername, connectionPassword);
            System.out.println("Connected");
            statement = conn.createStatement();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Return results after SQL Operation
    private ResultSet ExecuteOperation(String query) throws SQLException {
        return statement.executeQuery(query);//For Select
    }

    private int ExecuteUpdateOperation(String query) throws SQLException {
        return statement.executeUpdate(query);//For insert update delete
    }

    public int postSignUpUser(String firstName, String lastName,
            String mobile, String gender, String email, String password, String confirmedPassword , String Dp) {

        int user = 0;

        String POST_USER_DATA
                = "insert into " + databaseName + ".users (userFirstName, userLastName ,"
                + " userEmail ,  userGender ,userPhoneNumber,  userPassword, profilePic  ) "
                + "values ("
                + "'" + firstName + "' , '" + lastName + "' , '" + email + "' , '" + gender + "' , "
                + "'" + mobile + "', SHA('" + password + "'),'"+Dp+"')";

        try {
            System.out.println(POST_USER_DATA);
            var resultSet = ExecuteUpdateOperation(POST_USER_DATA);
            System.out.println(resultSet);
            user = resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    public ArrayList<String> getSignInUser(String email, String password) {

        ArrayList<String> user = new ArrayList<String>();
        final String GET_SIGN_IN_USER = "select userId, userFirstName ,profilePic from "
                + databaseName + ".users where userEmail = '" + email + "' and userPassword = "
                + " SHA('" + password + "')";

        try {
            System.out.println(GET_SIGN_IN_USER);
            var resultSet = ExecuteOperation(GET_SIGN_IN_USER);

            if (resultSet.next()) {
                System.out.println(resultSet.getString(1) + resultSet.getString(2));
            }
            user.add(resultSet.getString(1));
            user.add(resultSet.getString(2));
            user.add(resultSet.getString(3));
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    public ArrayList<String> getSignInAdmin(String email, String password) {

        ArrayList<String> user = new ArrayList<String>();
        final String GET_SIGN_IN_ADMIN = "select adminId from "
                + databaseName + ".admins where adminUsername = '" + email + "' and adminPassword = "
                + " SHA('" + password + "')";

        try {
            System.out.println(GET_SIGN_IN_ADMIN);
            var resultSet = ExecuteOperation(GET_SIGN_IN_ADMIN);

            if (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
            user.add(resultSet.getString(1));

        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

   /* public ArrayList<ArrayList<String>> getMenu() {
        final String GET_MENU = "Select * from tiffins";
        int rowcount = 0;
        ArrayList<ArrayList<String>> menu = new ArrayList<ArrayList<String>>();
        try {
            ResultSet result = ExecuteOperation(GET_MENU);
            while (result.next()) {
                ArrayList<String> premenu = new ArrayList<String>();
                for (int i = 1; i <= result.getMetaData().getColumnCount(); i++) {
                    premenu.add(result.getString(i));
                }
                menu.add(rowcount, premenu);
                rowcount++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return menu;
    }*/

    public int getRows() {
        final String GET_NO_ROWS = "select count(*) from tiffins";
        int rows = 0;
        try {
            ResultSet resultSet = ExecuteOperation(GET_NO_ROWS);
            while (resultSet.next()) {
                rows = resultSet.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rows;

    }

    public ResultSet getTiffins() {
        final String GET_MENU = "Select * from tiffins";
        ResultSet result = null;
        try {
            result = ExecuteOperation(GET_MENU);

        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public int deleteTiffins(int tiffinid) {

        final String DELETE_TIFFIN = "delete from tiffins where tiffinId = ?";
        int result = 0;
        try {
            ps = conn.prepareStatement(DELETE_TIFFIN);
            ps.setInt(1, tiffinid);
            result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(result);
        return result;

    }

    public int updateTiffins(Tiffins tiffin) {
        final String UPDATE_TIFFINS = "update tiffins set tiffinId = ?,"
                + "tiffinName = ? , tiffinRoti = ?, tiffinSabji = ?, "
                + "tiffinRice = ?, tiffinDal = ?, tiffinPappad = ?, tiffinSweet = ?, tiffinPrice = ? where tiffinId = ?";

        int result = 0;
        try {

            ps = conn.prepareStatement(UPDATE_TIFFINS);
            ps.setInt(1, tiffin.id);
            ps.setString(2, tiffin.name);
            ps.setInt(3, tiffin.roti);
            ps.setString(4, tiffin.sabji);
            ps.setInt(5, tiffin.rice);
            ps.setString(6, tiffin.dal);
            ps.setInt(7, tiffin.pappad);
            ps.setString(8, tiffin.sweet);
            ps.setInt(9, tiffin.price);
            ps.setInt(10, tiffin.id);

            result = ps.executeUpdate();
            System.out.println(result);

        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public int createTiffins(Tiffins tiffin) {

        final String QUERY = "insert into tiffins value(?,?,?,?,?,?,?,?,?)";
        int result = 0;
        try {
            ps = conn.prepareStatement(QUERY);
            ps.setInt(1, tiffin.id);
            ps.setString(2, tiffin.name);
            ps.setInt(3, tiffin.roti);
            ps.setString(4, tiffin.sabji);
            ps.setInt(5, tiffin.rice);
            ps.setString(6, tiffin.dal);
            ps.setInt(7, tiffin.pappad);
            ps.setString(8, tiffin.sweet);
            ps.setInt(9, tiffin.price);
            result = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public ResultSet getOrders() {
        final String QUERY = "Select * from orders";
        ResultSet result = null;
        try {
            result = ExecuteOperation(QUERY);

        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    
    public int orderTiffin(ArrayList<Order> menu){
        int uid = menu.get(0).uid;
        int tid = menu.get(0).tid;
        int price = menu.get(0).price;
        float rating = menu.get(0).rating;
        int result = 0;
        
        final String PLACE_ORDER = "Insert into " + databaseName + ".orders (userId , tiffinId , tiffinPrice ,rating)"+
                "values ( '" + uid + "' , '"+ tid +"' , '"+ price +"' , '"+ rating +"')";
        try {
            result = ExecuteUpdateOperation(PLACE_ORDER);
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }


    public int setOrderStatus(int orderId, String orderStatus) {
        final String QUERY = "update orders set status = ? where orderId = ?";
        int result = 0;
        try {

            ps = conn.prepareStatement(QUERY);
            ps.setString(1, orderStatus);
            ps.setInt(2, orderId);
            result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        return result;
    }


}
