package services;

import models.*;
import readwrite.write.Writer;

import java.util.Collections;

public class SpectacleService {
    private final Writer audit = new Writer();

    public void printSeatsAvailable(Spectacle spectacle) {
        audit.writeData("SpectacleService", "printSeatsAvailable");
        Balcony a = new Balcony();
        Loge b = new Loge();
        StandardSeat c = new StandardSeat();

        System.out.println("We have " + countAvailableStandardSeats(spectacle) + " standard seats available at price " + c.getPrice());
        System.out.println("We have " + countAvailableBalcony(spectacle) + " balcony seats available at price " + a.getPrice());
        System.out.println("We have " + countAvailableLoge(spectacle) + " loge seats available at price " + b.getPrice());
    }


    int getFirstOfTypeIndex(String s, Spectacle spectacle) {
        audit.writeData("SpectacleService", "getFirstOfTypeIndex");
        int i = 0;
        for (Seat x : spectacle.getAvailableSeats()) {
            if (s.equals("Balcony") && x instanceof Balcony) {
                return i;
            } else if (s.equals("StandardSeat") && x instanceof StandardSeat) {
                return i;
            } else if (s.equals("Loge") && x instanceof Loge) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void displayAvailableSeats(Spectacle spectacle) {
        audit.writeData("SpectacleService", "displayAvailableSeats");
        sortAvailableSeats(spectacle);
        for (Seat x : spectacle.getAvailableSeats())
            System.out.println(x.toString());
    }

    private int countAvailableStandardSeats(Spectacle spectacle) {
        audit.writeData("SpectacleService", "countAvailableStandardSeats");
        int count = 0;
        for (Seat x : spectacle.getAvailableSeats())
            if (x instanceof StandardSeat)
                count++;
        return count;
    }

    private int countAvailableBalcony(Spectacle spectacle) {
        audit.writeData("SpectacleService", "countAvailableBalcony");
        int count = 0;
        for (Seat x : spectacle.getAvailableSeats())
            if (x instanceof Balcony)
                count++;
        return count;
    }

    private int countAvailableLoge(Spectacle spectacle) {
        audit.writeData("SpectacleService", "countAvailableLoge");
        int count = 0;
        for (Seat x : spectacle.getAvailableSeats())
            if (x instanceof Loge)
                count++;
        return count;
    }

    public void deleteSeat(int i, Spectacle spectacle) {
        audit.writeData("SpectacleService", "deleteSeat");
        spectacle.getAvailableSeats().remove(i);
    }


    public void sortAvailableSeats(Spectacle spectacle) {
        audit.writeData("SpectacleService", "sortAvailableSeats");
        Collections.sort(spectacle.getAvailableSeats());
    }

}
