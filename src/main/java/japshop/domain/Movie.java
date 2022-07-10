package japshop.domain;

import javax.persistence.Entity;

@Entity
public class Movie extends Item {

    private String director;
    private String actor;

    public String director() {
        return director;
    }

    public void director(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
