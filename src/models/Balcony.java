package models;

public class Balcony extends Seat {
    public Balcony(int number, int row, int visibility) {
        super(number, row, visibility);
        price = 100;
    }


    public Balcony() {
        visibility = 2;
        price = 100;
    }

    @Override
    void setType(){
        this.type = 2;
    }

    @Override
    double getPrice() {
        return 100;
    }


    @Override
    public String toString() {
        return (super.toString() + " Balcony seat");
    }
}
