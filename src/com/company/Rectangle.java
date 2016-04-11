package com.company;

/**
 * Created by vlad.rusu on 4/11/16.
 */
public class Rectangle implements ShapeInterface {

    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override public double getArea() {
        return length * width;
    }

    public String toString() {
        return "Rectangle [" + length + ", " + width + "]";
    }

}
