package person;

import java.util.Date;

public class Client extends Person implements IAuth {
    private String username;
    private String password;
    private String status;

//    public Client(String lastName, String firstName, int year, int month, int day, String username, String password, String status) {
//        super(lastName, firstName, year, month, day);
//        this.username = username;
//        this.password = password;
//        this.status = status;
//    }

    public Client(String lastName, String firstName, int year, int month, int day) {
        super(lastName, firstName, year, month, day);
        username = "";
        password = "";
        status = "";
    }

    public Client() {
        username = "";
        password = "";
        status = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password))
            return true;
        return false;
    }

    public String register(String username, String password) {
        if (username.length() >= 5 && password.length() >= 4) {
            this.username = username;
            this.password = password;
            return "Successfully registered";
        }
        return "Try again";
    }

}

