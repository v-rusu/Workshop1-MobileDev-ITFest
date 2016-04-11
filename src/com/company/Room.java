package com.company;

/**
 * Created by vlad.rusu on 4/11/16.
 */
public class Room {

    String name;
    int numberOfSeats;

    public Room(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }

    public void turnLightsOn() {
        System.out.println("Lights on!");
    }

}
