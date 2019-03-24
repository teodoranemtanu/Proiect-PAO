package spectacle;

public class Standard extends Seat {
    public Standard(int number, int row, int visibility) {
        super(number, row, visibility);
    }

    public Standard() {
    }

    @Override
    double calculatePrice(){
        price = 50;
        return price;
    }
}
