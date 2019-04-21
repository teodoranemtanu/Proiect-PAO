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
    static private int count;

    int id;

    {
        ++count;
    }

    public Spectacle(String title, Actor[] actors, String director, String type, int length, Date date, ArrayList<Seat> availableSeats) {
        this.title = title;
        this.actors = actors;
        this.director = director;
        this.type = type;
        this.length = length;
        this.date = date;
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

    public void sortAvailableSeats() {
        Collections.sort(availableSeats);
    }

    public void displayAvailableSeats() {
        for (Seat x : availableSeats)
            System.out.println(x.toString());
    }

    public int countAvailableStandard() {
        int count = 0;
        for (Seat x : availableSeats)
            if (x instanceof Standard)
                count++;
        return count;
    }

    public int countAvailableBalcony() {
        int count = 0;
        for (Seat x : availableSeats)
            if (x instanceof Balcony)
                count++;
        return count;
    }

    public int countAvailableLoge() {
        int count = 0;
        for (Seat x : availableSeats)
            if (x instanceof Loge)
                count++;
        return count;
    }

    public void deleteSeat(int i) {
        availableSeats.remove(i);
    }

    public int getFirstOfTypeIndex(String s) {
        int i = 0;
        for (Seat x : availableSeats) {
            if (s.equals("Balcony") && x instanceof Balcony) {
                return i;
            } else if (s.equals("Standard") && x instanceof Standard) {
                return i;
            } else if (s.equals("Loge") && x instanceof Loge) {
                return i;
            }
            i++;
        }
        return -1;
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
