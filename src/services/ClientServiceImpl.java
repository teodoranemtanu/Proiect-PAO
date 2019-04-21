package services;

import models.Client;

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


}
