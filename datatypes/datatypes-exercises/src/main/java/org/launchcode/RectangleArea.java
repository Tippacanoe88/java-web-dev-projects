package org.launchcode;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
//using print method we prompt the user for the length of the rectangle, storing the input in a double variable 'length'

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
//using the same methods, we store the input for width in the double variable 'width'

        double area = calculateArea(length, width);
//calculating area with a double method 'area' multiplying the double methods 'length' and 'width' then multiplying them together.

        System.out.println("The area of the rectangle is: " + area);
//prints calculated area by calling 'area'

        scanner.close();
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}

