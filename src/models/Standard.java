package models;

public class Standard extends Seat {
    public Standard(int number, int row, int visibility) {
        super(number, row, visibility);
        price = 50;
    }

    public Standard() {
        visibility = 1;
        price = 50;
    }

    @Override
    void setType() {
        type = 1;
    }

    @Override
    double getPrice() {
        return 50;
    }


    @Override
    public String toString() {
        return (super.toString() + " Standard seat");
    }

}
