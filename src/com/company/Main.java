package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello world!");

        Circle c1, c2;

        c1 = new Circle(5, "red");
        c2 = new Circle(10, "green");

        System.out.println(c1.toString());
        System.out.println(c2);

        c2 = new Circle(15);
        System.out.println(c2 + " Area: " + c2.getArea());

        Rectangle r = new Rectangle(12, 5);
        System.out.println(r + " Area: " + r.getArea());

        Square s = new Square(12);
        System.out.println(s + " Area: " + s.getArea());


        ShapeInterface shape1 = new Square(10);
        System.out.println(shape1);

        ShapeInterface[] shapesArray = new ShapeInterface[3];
        shapesArray[0] = new Rectangle(3, 4);
        shapesArray[1] = new Square(1);
        shapesArray[2] = new Circle(2);

        for (ShapeInterface shape: shapesArray) {
            System.out.println(shape + " Area: " + shape.getArea());
        }


        Rectangle rectangle1 = new Square(2);
        Rectangle rectangle2 = new Rectangle(1,2);

        System.out.println(rectangle1.toString()); // It calls the toString() method on Square.


        Room room = new Lab("name", 2, 3);
    }

    // Implement Rectangle class. It should have a method to calculate the area.


    // Implement Shape class that defines the method getArea(). Make sure all classes inherit from Shape and override the getArea() method.


    // Implement a Room class, it should have a name, the number of seats available and a method to turn on the lights.
    // Implement a Lab class that extends the Room class. A Lab has various numbers of computers.
    // Implement an Amphitheatre class that extends the Room class.

}
