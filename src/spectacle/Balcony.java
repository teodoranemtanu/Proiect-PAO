package spectacle;

public class Balcony extends Seat {
    public Balcony(int number, int row, int visibility) {
        super(number, row, visibility);
    }

    public Balcony() {
    }

    @Override
    double calculatePrice() {
        price = 50 + 20 * visibility;
        return price;
    }
}
