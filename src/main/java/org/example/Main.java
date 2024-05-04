package org.example;

import org.example.misc.Car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setColour("Blue");
        String colour = car.getColour();
        System.out.println(colour);
        car.drive("fast");

        // have my class do xyz
        // doing xyz


    }
}