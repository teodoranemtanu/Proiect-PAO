package spectacle;

public class Loge extends Seat {
    public Loge(int number, int row, int visibility) {
        super(number, row, visibility);
    }

    public Loge() {
    }

    @Override
    double calculatePrice() {
        price = 50 + 30 * visibility;
        return price;
    }
}
