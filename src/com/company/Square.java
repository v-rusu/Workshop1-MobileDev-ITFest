package com.company;

/**
 * Created by vlad.rusu on 4/11/16.
 */
public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    @Override public String toString() {
        return "Square [" + length + "]";
    }

}
