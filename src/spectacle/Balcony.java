package spectacle;

public class Balcony extends Seat {
    public Balcony(int number, int row, int visibility) {
        super(number, row, visibility);
    }

    public Balcony() {
        visibility = 2;
    }

    @Override
    void calculatePrice() {
        price = 50 + 30 * visibility;
    }

    @Override
    public String toString() {
        return (super.toString() + " Balcony seat");
    }
}
