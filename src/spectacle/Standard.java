package spectacle;

public class Standard extends Seat {
    public Standard(int number, int row, int visibility) {
        super(number, row, visibility);
    }

    public Standard() {
        visibility = 1;
    }

    @Override
    void calculatePrice() {
        price = 50;
    }

    @Override
    public String toString() {
        return (super.toString() + " Standard seat");
    }

}
