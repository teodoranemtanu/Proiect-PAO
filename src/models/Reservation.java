package models;

import models.Seat;
import models.Spectacle;


public class Reservation {
    private Spectacle spectacle;
    private int nrOfSeats;
    private Client client;
    int id;

    public Client getClient() {
        return client;
    }

    public Reservation(Spectacle spectacle, int nrOfSeats) {
        this.spectacle = spectacle;
        this.nrOfSeats = nrOfSeats;
        id = -1;
    }

    public Reservation(Spectacle spectacle, int nrOfSeats, Client client) {
        this.spectacle = spectacle;
        this.nrOfSeats = nrOfSeats;
        this.client = client;
    }

    public Reservation(Spectacle spectacle, Client client, int nrOfSeats, int id) {
        this.spectacle = spectacle;
        this.nrOfSeats = nrOfSeats;
        this.client = client;
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Reservation(){}

    public Spectacle getSpectacle() {
        return spectacle;
    }

    public void setSpectacle(Spectacle spectacle) {
        this.spectacle = spectacle;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " " + spectacle.toString() + " " + nrOfSeats;
    }
}