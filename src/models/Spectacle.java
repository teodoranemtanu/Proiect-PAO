package models;

import java.util.*;

public class Spectacle {
    private String title;
    private String director;
    private String type;
    private int length;  // saved in minutes
    private Date date;
    private ArrayList<Seat> availableSeats;
    private int id;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Spectacle(String title, String director, String type, int length) {
        this.title = title;
//        this.actors = actors;
        this.director = director;
        this.type = type;
        this.length = length;
//        this.availableSeats = availableSeats;
    }

    public void setAvailableSeats(ArrayList<Seat> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Spectacle(String title, String director, String type, int length, ArrayList<Seat> availableSeats) {
        this.title = title;
//        this.actors = actors;
        this.director = director;
        this.type = type;
        this.length = length;
        this.availableSeats = availableSeats;
    }

    public Spectacle() {
        title = "";
        director = "";
        type = "";
        length = 0;
    }

    public ArrayList<Seat> getAvailableSeats() {
        return availableSeats;
    }

    @Override
    public String toString() {
        return type + ", " + title + ", " + date + ", " + length +" min, by " + director;
    }
}
