package models;

import models.Seat;
import models.Spectacle;

import java.util.ArrayList;


public class Reservation {
    Spectacle spectacle;
    int nrOfSeats;
    ArrayList<Seat> seats;

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

    @Override
    public String toString() {
        return spectacle.toString() + " " + nrOfSeats + seats.toString();
    }
}