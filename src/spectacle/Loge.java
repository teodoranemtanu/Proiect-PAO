package spectacle;

public class Loge extends Seat {
    public Loge(int number, int row, int visibility) {
        super(number, row, visibility);
    }

    public Loge() {
        visibility = 3;
    }

    @Override
    void calculatePrice() {
        price = 50 + 30 * visibility;
    }

    @Override
    public String toString() {
        return (super.toString() + " Loge seat");
    }
}
