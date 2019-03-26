package services;

import spectacle.Seat;
import spectacle.Spectacle;

import java.util.ArrayList;
import java.util.Scanner;

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

    public boolean confirmReservation() {
        System.out.println("This is your reservation:");
        System.out.println(this.toString());
        System.out.println("Do you confirm?");
        String answer;
        Scanner in = new Scanner(System.in);
        answer = in.next();
        if (answer.equals("YES"))
            return true;
        else return false;
    }
}