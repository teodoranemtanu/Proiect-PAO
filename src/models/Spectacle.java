package models;

import java.util.*;

public class Spectacle {
    private String title;
    private Actor[] actors;
    private String director;
    private String type;
    private int length;  // saved in minutes
    private Date date;
    private ArrayList<Seat> availableSeats;
    static private int count = 0;

    private int id;

    static {
        count ++;
    }
    public Spectacle(String title, Actor[] actors, String director, String type, int length, ArrayList<Seat> availableSeats) {
        this.title = title;
        this.actors = actors;
        this.director = director;
        this.type = type;
        this.length = length;
        this.availableSeats = availableSeats;
        id = count;
    }

    public Spectacle() {
        title = "";
        actors = new Actor[0];
        director = "";
        type = "";
        length = 0;
    }

    public ArrayList<Seat> getAvailableSeats() {
        return availableSeats;
    }





    @Override
    public String toString() {
        return " Title='" + title + '\'' +
                ",  Type='" + type + '\'' +
                ",  Date=" + date +
                ",  id=" + id +
                '}';
    }
}
