package models;

public abstract class Seat implements Comparable<Seat> {
    private int number;
    private int row;
    int visibility;
    double price;
    int type;
    int id;



    Seat(int number, int row, int visibility) {
        this.number = number;
        this.row = row;
        this.visibility = visibility;
    }

    Seat() {
        number = 0;
        row = 0;
        visibility = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }


    abstract void setType();

    abstract double getPrice();


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

