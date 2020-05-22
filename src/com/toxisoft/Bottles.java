package com.toxisoft;

public class Bottles {
    private final int BOTTLEPERMINUTE = 5;
    private int bottles;
    private int minutes;

    public int getBottles() {
        return bottles;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        this.bottles = minutes * BOTTLEPERMINUTE;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Gastaste ")
                .append(this.bottles)
                .append(" botellas de agua.").toString();
    }
}
