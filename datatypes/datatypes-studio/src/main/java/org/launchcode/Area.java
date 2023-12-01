package org.launchcode;

import java.util.Scanner;

import org.launchcode.Circle;
public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle in a number: ");
        double radius = scanner.nextDouble();

        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is " + area);
        scanner.close();
    }
}
