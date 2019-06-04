package userInterface.dashboard;

import models.Client;
import models.Reservation;
import models.Spectacle;
import repositories.ClientRepository;
import repositories.ReservationRepository;
import repositories.SpectacleRepository;
import userInterface.login.Login;
import userInterface.register.RegisterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Dash extends JFrame implements ActionListener {
    private Client client;
    private ReservationRepository reservationRepository;
    private Container container = getContentPane();
    private JButton updateInfoButton = new JButton("Update Info");
    private JButton logoutButton = new JButton("Logout");
    private JLabel makeAReservationLabel = new JLabel("Make a reservation!");
    private JLabel chooseSpectacleLabel = new JLabel("Choose a spectacle from the list:");
    private JComboBox spectacleComboBox = new JComboBox(spectacleToList());
    private JLabel numberOfSeatsLabel = new JLabel("How many seats would you like:");
    private JTextField numberOfSeatsTextField = new JTextField();
    private JButton makeReservationButton = new JButton("Make Reservation!");

    private DefaultListModel model = new DefaultListModel();
    private JList reservationList = new JList(model);

    private JButton reservationRemoveButton = new JButton("Remove");


    String[] spectacleToList() {
        SpectacleRepository spectacleRepository = new SpectacleRepository();
        ArrayList<Spectacle> spectacles = spectacleRepository.getAllSpectacles();
        String[] spectaclesToList = new String[spectacles.size()];
        int i = 0;
        for (Spectacle spectacle : spectacles)
            spectaclesToList[i++] = spectacle.toString();
        return spectaclesToList;
    }

    Dash(Client client) {
        reservationRepository = new ReservationRepository();
        this.client = client;

        setLayoutManager();
        setLocationAndSizes();
        addComponentsToContainer();
        addActionEvent();

        for (Reservation reservation : reservationRepository.getReservationsByClient(client)) {
            model.addElement(reservation.toString());
        }

    }

    private void setLayoutManager() {
        container.setLayout(null);
    }

    private void setLocationAndSizes() {
        updateInfoButton.setBounds(20, 10, 100, 20);
        logoutButton.setBounds(255, 10, 80, 20);
        makeAReservationLabel.setBounds(120, 40, 370, 20);
        chooseSpectacleLabel.setBounds(80, 70, 350, 20);
        spectacleComboBox.setBounds(20, 100, 315, 30);
        numberOfSeatsLabel.setBounds(20, 140, 250, 20);
        numberOfSeatsTextField.setBounds(280, 140, 55, 20);
        makeReservationButton.setBounds(20, 180, 315, 20);
        reservationList.setBounds(20, 220, 315, 200);
        reservationRemoveButton.setBounds(255, 440, 80, 20);
    }

    private void addComponentsToContainer() {
        container.add(updateInfoButton);
        container.add(logoutButton);

        container.add(makeAReservationLabel);
        container.add(chooseSpectacleLabel);
        container.add(spectacleComboBox);

        container.add(numberOfSeatsLabel);
        container.add(numberOfSeatsTextField);
        container.add(makeReservationButton);
        container.add(reservationList);
        container.add(reservationRemoveButton);
    }

    public void addActionEvent() {
        updateInfoButton.addActionListener(this);
        logoutButton.addActionListener(this);
        spectacleComboBox.addActionListener(this);
        makeReservationButton.addActionListener(this);
        reservationRemoveButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == makeReservationButton) {
            int numberOfSeats = Integer.parseInt(numberOfSeatsTextField.getText());
            String spectacleString = (String) spectacleComboBox.getSelectedItem();
            String[] splitSpectacle = spectacleString.split(", ");

            SpectacleRepository spectacleRepository = new SpectacleRepository();
            Spectacle spectacle = spectacleRepository.getSpectacleByTitle(splitSpectacle[1]);

            Reservation reservation = new Reservation(spectacle, numberOfSeats, client);
            reservationRepository.saveReservation(reservation);

            model.addElement(reservation.toString());
            JOptionPane.showMessageDialog(this, "Reservation successfully made.");
        } else if (e.getSource() == reservationRemoveButton) {
            String reservationString = (String) reservationList.getSelectedValue();
            String [] splitReservationString = reservationString.split(" ");
            reservationRepository.deleteReservation(Integer.parseInt(splitReservationString[0]));
            model.removeElementAt(reservationList.getSelectedIndex());
        } else if (e.getSource() == logoutButton) {
            JOptionPane.showMessageDialog(this, "You have been logged out");
            dispose();
            Login.main(new String[0]);
        }

    }

}
