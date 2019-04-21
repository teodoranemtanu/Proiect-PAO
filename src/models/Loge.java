package models;

public class Loge extends Seat {
    public Loge(int number, int row, int visibility) {
        super(number, row, visibility);
        price = 150;
    }

    public Loge() {
        visibility = 3;
        price = 150;
    }

    @Override
    void setType(){
        type = 3;
    }

    @Override
    double getPrice() {
        return 150;
    }


    @Override
    public String toString() {
        return (super.toString() + " Loge seat");
    }
}
