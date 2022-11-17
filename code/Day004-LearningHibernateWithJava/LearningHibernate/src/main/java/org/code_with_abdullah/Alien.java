package org.code_with_abdullah;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="aliens")
public class Alien {
    @Id
    @Column(name = "id", nullable = false)
    private int alienId;
    @Column(name = "alien_name")
    private String alienName;
    @Column(name = "alien_color")
    private String color;

    public Alien(){}

    public int getAlienId() {
        return alienId;
    }

    public void setAlienId(int alienId) {
        this.alienId = alienId;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlienName(String alienName) {
        this.alienName = alienName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien {" +
                "alienId=" + alienId +
                ", alienName='" + alienName + '\'' +
                ", color='" + color + '\'' +
                "}.";
    }
}
