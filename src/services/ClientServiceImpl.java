package services;

import models.Client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClientServiceImpl implements ClientService {
    private Client client;

    public boolean login(String username, String password) {
        return (username.equals(client.getUsername()) && password.equals(client.getPassword()));
    }

    public String register(String username, String password) {
        if (username.length() >= 5 && password.length() >= 4) {
            client.setUsername(username);
            client.setPassword(password);
            return "Successfully registered";
        }
        return "Try again";
    }

    public void selectClient(){
        DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionInstance();
        Statement stmt = null;
        try {
            stmt = connection.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM client_data");
            while (rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
