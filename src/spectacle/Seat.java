package spectacle;

public abstract class Seat {
    int number;
    int row;
    protected int visibility;
    protected double price;

    Seat(int number, int row, int visibility) {
        this.number = number;
        this.row = row;
        this.visibility = visibility;
    }

    Seat() {
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }

    abstract double calculatePrice();

    public double getPrice(){
        calculatePrice();
        return price;
    }
}
