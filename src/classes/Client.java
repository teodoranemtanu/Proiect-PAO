package classes;

import java.util.Date;

public class Client extends Person {
    private String username;
    private String password;
    private String status;

    public Client(String lastName, String firstName, Date dateOfBirth, String username, String password, String status) {
        super(lastName, firstName, dateOfBirth);
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public Client(String lastName, String firstName, Date dateOfBirth) {
        super(lastName, firstName, dateOfBirth);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

