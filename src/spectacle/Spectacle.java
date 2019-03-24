package spectacle;

import classes.Actor;

public class Spectacle {
    private String title;
    private Actor[] actors;
    private String director;
    private String type;
    private int length;  // saved in minutes

    public Spectacle(String title, Actor[] actors, String director, String type, int length) {
        this.title = title;
        this.actors = actors;
        this.director = director;
        this.type = type;
        this.length = length;
    }

    public Spectacle(){
        title = "";
        actors = new Actor[0];
        director = "";
        type = "";
        length = 0;
    }
}
