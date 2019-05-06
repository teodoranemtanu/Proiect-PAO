package services;

import models.*;
import readwrite.write.Writer;

import java.util.*;

public class AdminService {
    private final Writer audit = new Writer();

    public void makeReservation(Client client, Reservation reservation) {
        audit.writeData("AdminService", "makeReservation");
        if (isClient(client)) {
            Admin.getReservations().put(client, reservation);
        }
    }

    public void addClient(Client client) {
        audit.writeData("AdminService", "addClient");
        Admin.getClients().add(client);
    }

    private boolean isClient(Client client) {
        audit.writeData("AdminService", "isClient");
        ClientServiceImpl clientService;
        clientService = new ClientServiceImpl();

        for (Client i : Admin.getClients()) {
            boolean logIn = clientService.login(i.getUsername(), i.getPassword());
            if (logIn) return true;
        }
        return false;
    }



}
