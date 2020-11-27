package homeScreen;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Backend {

    private Databaseconn databaseconn;

    public Backend() {
        databaseconn = new Databaseconn();

    }

    public int Register(String firstName, String lastName,
            String mobile, String gender, String email, String password, String confirmedPassword) {

        int user = databaseconn.postSignUpUser(firstName, lastName, mobile, gender, email,
                password, confirmedPassword);
        return user;
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
        } catch (Exception ex) {

        }

        return tiffinList;
    }

    public boolean deleteTiffin(int tiffinId) {

        try {
            databaseconn.deleteTiffins(tiffinId);
            return true;
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

}
