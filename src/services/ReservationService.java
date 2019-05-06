package services;

import models.Reservation;
import models.Seat;
import models.Spectacle;
import readwrite.write.Writer;

public class ReservationService {
    private Reservation reservation;
    private final Writer audit = new Writer();

    public boolean confirmReservation(Reservation reservation, String answer) {
        audit.writeData("ReservationService", "confirmReservation");
        return answer.equals("YES");
    }

    public boolean enoughSeatsAvailable(int number, Spectacle spectacle) {
        audit.writeData("ReservationService","enoughSeatsAvailable");
        int numberOfSeats = spectacle.getAvailableSeats().size();
        return numberOfSeats >= number;
    }

    public void chooseSeat(int number, String typeOfSeat, Spectacle spectacle){
        audit.writeData("ReservationService", "chooseSeat");
        SpectacleService spectacleService = new SpectacleService();
        for (int i = 0; i < number; i++) {
            int index = spectacleService.getFirstOfTypeIndex(typeOfSeat, spectacle);
            if (index != -1) {
                Seat newSeat = spectacle.getAvailableSeats().get(index);
                reservation.getSeats().add(newSeat);
                spectacleService.deleteSeat(index, spectacle);
            }
        }
    }


}
