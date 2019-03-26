package main;

import person.Actor;
import person.Client;
import services.Admin;
import spectacle.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
        availableSeats.add(0, new Standard(15, 2, 2));
        availableSeats.add(1, new Standard(16, 2, 2));
        availableSeats.add(2, new Balcony(5, 1, 2));
        availableSeats.add(3, new Balcony(6, 2, 3));
        availableSeats.add(4, new Loge(7, 2, 1));

        Client client1 = new Client("A", "B", 1999, 0, 1);
        Client client2 = new Client("C", "D", 2000, 0, 3);
        Client client3 = new Client("C", "D", 2000, 0, 3);
        Client client4 = new Client("C", "D", 2000, 0, 3);

        Admin admin = new Admin();
        admin.makeReservation(client1);
        admin.cancelReservation(client1);
        admin.makeReservation(client2);
        admin.makeReservation(client3);
        admin.makeReservation(client4);

    }
}

