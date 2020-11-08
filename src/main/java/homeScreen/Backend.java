package homeScreen;

public class Backend {

    private Databaseconn databaseconn;

    public Backend() {
        databaseconn = new Databaseconn();
        System.out.println("Hello & Welcome to Constructor");
    }

    public int Register(String firstName, String lastName,
            String mobile, String gender, String email, String password, String confirmedPassword) {

        int user = databaseconn.postSignUpUser(firstName, lastName, mobile, gender, email,
                password, confirmedPassword);
        return user;
    }

}
