package models;

import readwrite.write.Writer;

public class Actor extends Person {
    private String description;
    private final Writer audit = new Writer();

    public Actor(String lastName, String firstName, int year, int month, int day, String description) {
        super(lastName, firstName, year, month, day);
        this.description = description;
        audit.writeData("Actor", "constructor");
    }

    public Actor(String lastName, String firstName, int year, int month, int day) {
        super(lastName, firstName, year, month, day);
        description = "";
    }

    public Actor() {
        description = "";
    }

}
