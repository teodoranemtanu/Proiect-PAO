package spectacle;

import java.util.ArrayList;

public class Theatre {
    private ArrayList<Seat> seats;
    private static Theatre theatre = null;

    private Theatre(){
        seats = new ArrayList<>();
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public static Theatre getTheatre(){
        if(theatre == null)
            theatre = new Theatre();
        return theatre;
    }
}
