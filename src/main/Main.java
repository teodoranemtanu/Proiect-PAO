package main;

import models.*;
import readwrite.read.ClientReader;
import readwrite.read.SeatReader;
import services.AdminService;
import services.ClientServiceImpl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Actor[] actors = new Actor[2];
        actors[0] = new Actor();
        actors[0].setFirstName("A");
        actors[1] = new Actor();
        actors[1].setFirstName("B");
        Calendar a = Calendar.getInstance();
        a.set(2019, 5, 19);

        Date date = a.getTime();

        ArrayList<Seat> availableSeats = new ArrayList<Seat>(5);
        availableSeats.add(0, new StandardSeat(15, 2));
        availableSeats.add(1, new StandardSeat(16, 2));
        availableSeats.add(2, new Balcony(5, 1));
        availableSeats.add(3, new Balcony(6, 2));
        availableSeats.add(4, new Loge(7, 2));

        Client client1 = new Client("A", "B", 1999, 0, 1);
        Client client2 = new Client("C", "D", 2000, 0, 3);
        Client client3 = new Client("C", "D", 2000, 0, 3);
        Client client4 = new Client("C", "D", 2000, 0, 3);



        ClientReader clientReader = new ClientReader();
        ClientReader.readData();
        Admin.getAdmin();
        ArrayList<Client> list  = new ArrayList<Client>(ClientReader.getClientList());
        Admin.setClients(list);

        ArrayList<Client> list2 = Admin.getClients();
        for(Client i : list2)
            System.out.println(i);

        SeatReader seatReader = new SeatReader();
        SeatReader.readData();

    }

}

