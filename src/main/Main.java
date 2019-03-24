package main;

import classes.Client;
import classes.Person;
import spectacle.Loge;
import spectacle.Seat;
import spectacle.Spectacle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person a = new Client();
        System.out.println(a.getDateOfBirth());
        Spectacle b = new Spectacle();

        ArrayList<Seat> seats = new ArrayList<Seat>(5);

        Seat c = new Loge(2,3,2);
        seats.add(c);
        System.out.println(seats.get(0).getPrice());
    }
}

