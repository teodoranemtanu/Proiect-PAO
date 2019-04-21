package models;

public class Client extends Person {
    private String username;
    private String password;
    int id;

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
    }

    public Client() {
        username = "";
        password = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

