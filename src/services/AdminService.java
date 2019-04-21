package services;

import models.*;

import java.util.*;

public class AdminService {
    static HashMap<Client, Reservation> reservations;
    static ArrayList<Client> clients;
    static ArrayList<Spectacle> spectacles;
    static Theatre theatre;

    {
        clients = new ArrayList<Client>();
        spectacles = new ArrayList<Spectacle>();

        /// adding initial clients for testing purpose
        clients.add(new Client("A", "B", 1999, 0, 1));
        clients.add(new Client("Ab", "Ba", 1999, 0, 1));
        clients.add(new Client("Ac", "Bd", 1999, 0, 1));
        clients.add(new Client("Ad", "Bc", 1999, 0, 1));

        clients.get(0).setUsername("client1");
        clients.get(1).setUsername("client2");
        clients.get(2).setUsername("client3");
        clients.get(3).setUsername("client4");

        clients.get(0).setPassword("client");
        clients.get(1).setPassword("client");
        clients.get(2).setPassword("client");
        clients.get(3).setPassword("client");

        theatre = Theatre.getTheatre();

//        String title, Actor[] actors, String director, String type, int length, Date date, ArrayList<Seat> availableSeats
        for (int i = 0; i < 11; i++) {

            Actor[] actors = new Actor[2];
            actors[0] = new Actor();
            actors[0].setFirstName("A");
            actors[1] = new Actor();
            actors[1].setFirstName("B");
            Calendar a = Calendar.getInstance();
            a.set(2019, i, i);

            Date date = a.getTime();

            Spectacle x = new Spectacle("Title", actors, "director", "opera", 100, date, theatre.getSeats());
            spectacles.add(x);
        }
        reservations = new HashMap<Client, Reservation>();
    }

    Seat getTypeOfSeat(String s) {
        Seat newSeat;
        if (s.equals("Standard")) {
            newSeat = new Standard();
        } else if (s.equals("Balcony")) {
            newSeat = new Balcony();
        } else if (s.equals("Loge")) {
            newSeat = new Loge();
        } else newSeat = new Standard();
        return newSeat;
    }

//
//    public Client makeReservation(Client client) {
//        boolean loggedIn = false;
//        System.out.println("Do you have an account?");
//        Scanner in = new Scanner(System.in);
//        String answer = in.nextLine();
//
//        System.out.println("Please write username and password below: ");
//        String username = in.nextLine();
//        String password = in.nextLine();
//
//        if (answer.equals("YES")) {
//            for (Client i : clients) {
//                loggedIn = i.login(username, password);
//                if (loggedIn) break;
//            }
//            if (!loggedIn) System.out.println("Wrong username or password.");
//
//        } else if (answer.equals("NO")) {
//            client.register(username, password);
//            clients.add(client);
//            System.out.println("Created account successfully");
//            loggedIn = true;
//        }
//        if (loggedIn) {
//            System.out.println("Logged in successfully");
//            System.out.println("This are the spectacles available: ");
//            for (Spectacle s : spectacles)
//                System.out.println(s.toString());
//            System.out.println("Which one do you choose?");
//            int id = in.nextInt(); /// id of the chosen spectacle
//            System.out.println("How many seats would you like?");
//            int number = in.nextInt();
////            System.out.println(spectacles.get(id - 1).getAvailableSeats().toString());
//            int numberOfSeats = spectacles.get(id - 1).getAvailableSeats().size();
//            if (numberOfSeats < number) {
//                System.out.println("No seats available.");
//            } else {
//                Balcony a = new Balcony();
//                Loge b = new Loge();
//                Standard c = new Standard();
//
//                System.out.println("We have " + spectacles.get(id - 1).countAvailableStandard() + " standard seats available at price " + c.getPrice());
//                System.out.println("We have " + spectacles.get(id - 1).countAvailableBalcony() + " balcony seats available at price " + a.getPrice());
//                System.out.println("We have " + spectacles.get(id - 1).countAvailableLoge() + " loge seats available at price " + b.getPrice());
//
//                System.out.println("Which ones are you interested in?");
//
//                Reservation reservation = new Reservation();
//                reservation.spectacle = spectacles.get(id - 1);
//                reservation.nrOfSeats = number;
//
//
//                for (int i = 0; i < number; i++) {
//                    answer = in.next();
//                    int index = spectacles.get(id - 1).getFirstOfTypeIndex(answer);
//                    if (index != -1) {
//                        Seat newSeat = spectacles.get(id - 1).getAvailableSeats().get(index);
//                        reservation.seats.add(newSeat);
//                        spectacles.get(id - 1).deleteSeat(index);
//                    }
//                }
//                if (reservation.confirmReservation()) {
//                    reservations.put(client, reservation);
//                    System.out.println("Reservation successully made!");
//                } else {
//                    for (int i = 0; i < reservation.seats.size(); i++) {
//                        reservation.spectacle.getAvailableSeats().add(reservation.seats.get(i));
//                    }
//                }
//            }
//        }
//        return client;
//    }
//
//    public Client cancelReservation(Client client) {
//        Reservation reservation = reservations.get(client);
//        reservation.setNrOfSeats(0);
//        for (int i = 0; i < reservation.seats.size(); i++) {
//            reservation.spectacle.getAvailableSeats().add(reservation.seats.get(i));
//        }
//        for (int i = 0; i < reservation.seats.size(); i++) {
//            reservation.seats.remove(reservation.seats.get(i));
//        }
//        reservations.remove(client);
//        return client;
//    }
//
//    public boolean confirmReservation() {
//        System.out.println("This is your reservation:");
//        System.out.println(this.toString());
//        System.out.println("Do you confirm?");
//        String answer;
//        Scanner in = new Scanner(System.in);
//        answer = in.next();
//        if (answer.equals("YES"))
//            return true;
//        else return false;
//    }

}
