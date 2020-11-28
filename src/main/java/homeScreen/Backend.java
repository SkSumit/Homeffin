package homeScreen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Backend {

    private int results;

    private Databaseconn databaseconn;

    public Backend() {
        databaseconn = new Databaseconn();

    }

    public int Register(String firstName, String lastName,
            String mobile, String gender, String email, String password, String confirmedPassword, String Dp) {

        int user = databaseconn.postSignUpUser(firstName, lastName, mobile, gender, email,
                password, confirmedPassword, Dp);
        return user;
    }

    public ArrayList<Users> getAllUsers() {
        ArrayList<Users> userList = new ArrayList<Users>();
        try {

            ResultSet result = databaseconn.getAllUsers();
            while (result.next()) {
                Users user = new Users();
                user.id = result.getInt("userId");
                user.firstName = result.getString("userFirstName");
                user.lastName = result.getString("userLastName");
                user.email = result.getString("userEmail");
                user.gender = result.getString("userGender");
                user.phoneNumber = result.getString("userPhoneNumber");
                user.password = result.getString("userPassword");
                user.profilePic = result.getString("profilePic");

                userList.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Backend.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }

    public ArrayList<Tiffins> getTiffins() {

        ArrayList<Tiffins> tiffinList = new ArrayList<Tiffins>();
        try {
            ResultSet result = databaseconn.getTiffins();
            while (result.next()) {
                Tiffins tiffin = new Tiffins();

                tiffin.id = result.getInt("tiffinId");
                tiffin.name = result.getString("tiffinName");
                tiffin.roti = result.getInt("tiffinRoti");
                tiffin.sabji = result.getString("tiffinSabji");
                tiffin.rice = result.getInt("tiffinRice");
                tiffin.dal = result.getString("tiffinDal");
                tiffin.pappad = result.getInt("tiffinPappad");
                tiffin.sweet = result.getString("tiffinSweet");
                tiffin.price = result.getInt("tiffinPrice");

                tiffinList.add(tiffin);

            }
            System.out.println(tiffinList);
        } catch (Exception ex) {

        }

        return tiffinList;
    }

    public boolean deleteTiffin(int tiffinId) {

        try {
            results = databaseconn.deleteTiffins(tiffinId);
            if (results == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;

        }

    }

    public int updateTiffin(Tiffins tiffin) {
        int result = 0;
        try {
            result = databaseconn.updateTiffins(tiffin);
            if (result == 0) {
                try {
                    databaseconn.createTiffins(tiffin);
                    return 2;
                } catch (Exception ex) {
                    Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }

            }
            System.out.println(result);

        } catch (Exception ex) {
        }
        return result;
    }

    public int getTiffinCount() {

        int numberofTiffins = 0;

        numberofTiffins = this.getTiffins().size();

        return numberofTiffins;
    }

    public ArrayList<Orders> getOrders() {

        ArrayList<Orders> orderList = new ArrayList<Orders>();
        try {
            ResultSet result = databaseconn.getOrders();
            while (result.next()) {
                Orders order = new Orders();

                order.OrderId = result.getInt("orderId");
                order.userId = result.getInt("userId");
                order.tiffinId = result.getInt("tiffinId");
                order.tiffinPrice = result.getInt("tiffinPrice");
                order.Status = result.getString("status");
                order.rating = result.getFloat("rating");

                orderList.add(order);

            }
        } catch (Exception ex) {

        }

        return orderList;
    }

    public int setOrderStatus(int orderId, String orderStatus) {
        int result = 0;
        try {
            result = databaseconn.setOrderStatus(orderId, orderStatus);

        } catch (Exception ex) {
        }
        return result;

    }

    public int placeOrder(Tiffins menu, int uid) {
        Order order = new Order();
        ArrayList<Order> tiffinList = new ArrayList<Order>();
        order.tid = menu.id;//tiffinid
        order.price = menu.price;//price
        order.uid = uid;//userid
        order.rating = 5;
        tiffinList.add(order);

        int result = databaseconn.orderTiffin(tiffinList);
        return result;
    }

    public int deleteOrder(int orderId) throws Exception {
        int result = 0;
        try {
            result = databaseconn.deleteOrder(orderId);
            if (result == 0) {
                return -1;
            }

        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

    public int getUserOrderCount(int userId) {
        ResultSet result = null;
        int count = 0;
        try {
            result = databaseconn.getUserOrderCount(userId);
            while (result.next()) {
                System.out.println("COUNT" + result.getString(1));
                count = result.getInt(1);
            }

        } catch (Exception ex) {
        }
        return count;

    }

    public int getUserTotalBill(int userId) {
        ResultSet result = null;
        int count = 0;
        try {
            result = databaseconn.getUserTotalBill(userId);
            while (result.next()) {
                System.out.println("COUNT" + result.getString(1));
                count = result.getInt(1);
            }

        } catch (Exception ex) {
        }
        return count;

    }

    public int deleteUser(int userId) throws Exception {
        int result = 0;
        try {
            result = databaseconn.deleteUser(userId);
            if (result == 0) {
                return -1;
            }

        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }
}
