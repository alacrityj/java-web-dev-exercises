package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = 0;

        do {
            System.out.println("Enter a radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("That's not number!");
                System.out.println("Please enter a number: ");
                input.next();
            }
            r = input.nextDouble();
            if (r <= 0) {
                System.out.println("Positive numbers only!");
            }
        } while (r <= 0);

        Double result = Circle.getArea(r);
        System.out.println("The area of the circle w/a radius of " + r + " is: " + result);

    }
}
