package main;

import models.*;
import readwrite.read.ClientReader;
import readwrite.read.SeatReader;
import readwrite.read.SpectacleReader;
import readwrite.write.ObjectWriter;
import services.AdminService;

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


        SeatReader seatReader = new SeatReader();
        SeatReader.readData();

        ObjectWriter writer = new ObjectWriter();


        ArrayList<Client> list2 = Admin.getClients();
        for(Client i : list2){
            writer.writeData(i, "client");
            System.out.println(i);
        }



        SpectacleReader spectacleReader = new SpectacleReader();
        SpectacleReader.readData();

        Spectacle spectacle = SpectacleReader.getSpectacleList().get(0);

        ArrayList <Seat> seatList = new ArrayList<>();
        seatList.add(SeatReader.getSeatList().get(0));
        seatList.add(SeatReader.getSeatList().get(1));


        Reservation reservation = new Reservation(spectacle, 2, seatList);

        AdminService adminService = new AdminService();

        adminService.makeReservation(list2.get(0), reservation);


        System.out.println(Admin.getReservations().get(list2.get(0)).toString());
    }

}

