package com.bridgelabz;

import java.util.Scanner;

/**
 * @author GovardhanReddy
 */
public class LineComparison {
    /**
     * use equals and compare method
     */
    Scanner scanner = new Scanner(System.in);
    LinePoints firstPointCoordinates = new LinePoints();
    LinePoints secondPointsCoordinates = new LinePoints();
    public void inputsOfCoordinates() {
        /**
         * use this method assign values to coordinates
         */
        System.out.print("Enter x1 value : ");
        firstPointCoordinates.setX(scanner.nextDouble());
        System.out.print("Enter x2 value : ");
        secondPointsCoordinates.setX(scanner.nextDouble());
        System.out.print("Enter y1 value : ");
        firstPointCoordinates.setY(scanner.nextDouble());
        System.out.print("Enter y2 value : ");
        secondPointsCoordinates.setY(scanner.nextDouble());
    }
    public double lineLength() {
        /**
         * use the coordinates find the length of line
         */
        inputsOfCoordinates();
        double length = Math.sqrt(Math.pow(secondPointsCoordinates.getX() - firstPointCoordinates.getX(), 2) + Math.pow(secondPointsCoordinates.getY() - firstPointCoordinates.getY(), 2));
        return length;
    }
    public void equalsMethod(Double lineOne, Double lineTwo) {
        /**
         * use equals method output is true or false
         */
        boolean result = lineOne.equals(lineTwo);
        if (result == true) {
            System.out.println(lineOne + " and " + lineTwo + " are equal lengths");
        } else {
            System.out.println(lineOne + " and " + lineTwo + " are not equal lengths");
        }
    }
    public void compareMethod(Double lineOne, Double lineTwo) {
        /**
         * Use compare method output is 1 or -1 or 0
         */
        int result = lineOne.compareTo(lineTwo);
        if (result == 0) {
            System.out.println(lineOne + " and " + lineTwo + " are equal lengths");
        } else if (result == 1) {
            System.out.println(lineOne + " is grater then " + lineTwo);
        } else {
            System.out.println(lineOne + " is lesser then " + lineTwo);
        }
    }
}
