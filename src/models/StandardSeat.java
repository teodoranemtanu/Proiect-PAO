package models;

import readwrite.write.Writer;

public class StandardSeat extends Seat {
    private final Writer audit = new Writer();

    public StandardSeat(int number, int row) {
        super(number, row);
        visibility = 1;
        price = 50;
        type = "Standard";
    }

    public StandardSeat(int number, int row, String type){
        super(number, row);
        visibility = 1;
        this.type = type;
        audit.writeData("StandardSeat", "constructor");
    }


    public StandardSeat() {
        visibility = 1;
        price = 50;
    }

    @Override
    void setType() {
        type = "Standard";
    }

    @Override
    public double getPrice() {
        return 50;
    }


    @Override
    public String toString() {
        return (super.toString() + " StandardSeat seat");
    }

}
