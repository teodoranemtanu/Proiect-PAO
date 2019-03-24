package classes;

import spectacle.Spectacle;

import java.util.Date;

public class Actor extends Person {
    private String description;

    public Actor(String lastName, String firstName, Date dateOfBirth, String description) {
        super(lastName, firstName, dateOfBirth);
        this.description = description;
    }

    public Actor(String lastName, String firstName, Date dateOfBirth) {
        super(lastName, firstName, dateOfBirth);
        description = "";
    }

    public Actor() {
        description = "";
    }
}
