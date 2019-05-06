package models;

import java.util.ArrayList;
import java.util.HashMap;

public class Admin {
    private static Admin admin;
    private HashMap<Client, Reservation> reservations;
    private ArrayList<Client> clients;
    private ArrayList<Spectacle> spectacles;
    private Theatre theatre;

    private Admin(){
        clients = new ArrayList<>();

    }

    public static HashMap<Client, Reservation> getReservations() {
        return admin.reservations;
    }

    public static void setReservations(HashMap<Client, Reservation> reservations) {
        admin.reservations = reservations;
    }

    public static ArrayList<Client> getClients() {
        return admin.clients;
    }

    public static void setClients(ArrayList<Client> clients) {
        if(admin.clients.size() == 0){
            admin.clients = new ArrayList<>(clients);
        }else admin.clients.addAll(clients);
    }

    public static ArrayList<Spectacle> getSpectacles() {
        return admin.spectacles;
    }

    public static void setSpectacles(ArrayList<Spectacle> spectacles) {
        admin.spectacles = spectacles;
    }

    public static Theatre getTheatre() {
        return admin.theatre;
    }

    public static void setTheatre(Theatre theatre) {
        admin.theatre = theatre;
    }

    public static Admin getAdmin() {
        if (admin == null)
            admin = new Admin();
        return admin;
    }


}
