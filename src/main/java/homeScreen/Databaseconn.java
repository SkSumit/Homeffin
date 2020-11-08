package homeScreen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//Class Creation

public class Databaseconn {

    private Connection conn;
    private Statement statement;
    private String connectionUsername = "root";
    private String connectionPassword = "";
    private String databaseName = "homeffins";

    //SQL QUERIES
    private static final String GET_ALL_USERS = "select * from restro.custdata";

    //Constructor and Innitialization
    public Databaseconn() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restro",
                    connectionUsername, connectionPassword);
            System.out.println("Connected");
            statement = conn.createStatement();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Return results after SQL Operation
    private ResultSet ExecuteOperation(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    private int ExecuteUpdateOperation(String query) throws SQLException {
        return statement.executeUpdate(query);
    }

    //GET Registered Users from DB
    public ArrayList<String> getUsers() {
        ArrayList<String> userList = new ArrayList<String>();

        try {
            var resultSet = ExecuteOperation(GET_ALL_USERS);
            while (resultSet.next()) {
                System.out.println(resultSet);
                userList.add(resultSet.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }

    public int postSignUpUser(String firstName, String lastName,
            String mobile, String gender, String email, String password, String confirmedPassword) {

        int user = 0;

        String POST_USER_DATA
                = "insert into " + databaseName + ".users (userFirstName, userLastName ,\n"
                + "  userEmail ," + "  userGender ," + "  userPhoneNumber," + "  userPassword ) "
                + "values ("
                + "'" + firstName + "' , '" + lastName + "' , '" + email + "' , '" + gender + "' , "
                + "'" + mobile + "', SHA('" + password + "'))";

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
        final String GET_SIGN_IN_USER = "select userId, userFirstName from "
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
}
