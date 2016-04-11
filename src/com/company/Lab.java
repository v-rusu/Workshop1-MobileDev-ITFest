package com.company;

/**
 * Created by vlad.rusu on 4/11/16.
 */
public class Lab extends Room {

    int numberOfComputers;

    public Lab(String name, int numberOfSeats, int numberOfComputers) {
        super(name, numberOfSeats);

        this.numberOfComputers = numberOfComputers;
    }
}
