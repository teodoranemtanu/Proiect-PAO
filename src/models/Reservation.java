package models;

import models.Seat;
import models.Spectacle;

import java.util.ArrayList;


public class Reservation {
    private Spectacle spectacle;
    private int nrOfSeats;
    private ArrayList<Seat> seats;
    int id;
    static int count = 0;

    public Reservation(Spectacle spectacle, int nrOfSeats, ArrayList<Seat> seats) {
        this.spectacle = spectacle;
        this.nrOfSeats = nrOfSeats;
        this.seats = seats;
        this.id = count;
    }

    static {
        count ++;
    }


    Reservation() {
        seats = new ArrayList<Seat>();
    }

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

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return spectacle.toString() + " " + nrOfSeats + seats.toString();
    }
}