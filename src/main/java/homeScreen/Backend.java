package homeScreen;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Backend {
    private int results;

    private Databaseconn databaseconn;

    public Backend() {
        databaseconn = new Databaseconn();

    }

    public int Register(String firstName, String lastName,
            String mobile, String gender, String email, String password, String confirmedPassword , String Dp) {

        int user = databaseconn.postSignUpUser(firstName, lastName, mobile, gender, email,
                password, confirmedPassword ,Dp);
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
            System.out.println(tiffinList);
        } catch (Exception ex) {

        }

        return tiffinList;
    }

    public boolean deleteTiffin(int tiffinId) {
        
        try {
            results = databaseconn.deleteTiffins(tiffinId);
            if(results == 1){
             return true;   
            }
            else
             return false;
        } catch (Exception ex) {
            return false;

        }

    }

    public boolean checkTiffinIdExsist(int tiffinId) {

        return true;
    }
    
    public int placeOrder(Tiffins menu , int uid){
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

}
