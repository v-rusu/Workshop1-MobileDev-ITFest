package com.company;

/**
 * Created by vlad.rusu on 4/11/16.
 */
public class Circle implements ShapeInterface {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "yellow";
    }

    @Override public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle: [" + radius + ", " + color + "]";
    }

}
