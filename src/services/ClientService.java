package services;

import models.Client;

public interface ClientService {
    public boolean login(String username, String password);

    public Client register(String username, String password);


}

