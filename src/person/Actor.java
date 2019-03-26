package person;

import java.util.Date;

public class Actor extends Person {
    private String description;

    public Actor(String lastName, String firstName, int year, int month, int day, String description) {
        super(lastName, firstName, year, month, day);
        this.description = description;
    }

    public Actor(String lastName, String firstName, int year, int month, int day) {
        super(lastName, firstName, year, month, day);
        description = "";
    }

    public Actor() {
        description = "";
    }
}
