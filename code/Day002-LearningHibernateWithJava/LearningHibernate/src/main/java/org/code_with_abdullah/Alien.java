package org.code_with_abdullah;

public class Alien {
    private int alienId;
    private String alienName;
    private String color;

    public Alien(int alienId, String alienName, String color) {
        this.alienId = alienId;
        this.alienName = alienName;
        this.color = color;
    }

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
}
