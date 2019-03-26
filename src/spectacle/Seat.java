package spectacle;

import java.util.Comparator;

public abstract class Seat implements Comparable<Seat> {
    int number;
    int row;
    protected int visibility;
    protected double price;

    Seat(int number, int row, int visibility) {
        this.number = number;
        this.row = row;
        this.visibility = visibility;
    }

    Seat() {
        number = 0;
        row = 0;
        visibility = 0;
        price = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }

    abstract void calculatePrice();

    public double getPrice() {
        calculatePrice();
        return price;
    }


    @Override
    public int compareTo(Seat o) {
        return -this.visibility - o.visibility;
    }

    @Override
    public String toString() {
        return ("Seat " + number +
                " from row " + row +
                " with visibility of " +
                visibility + "\n");
    }
}

