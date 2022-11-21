package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static double lineLength(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x1 co-ordinate : ");
        double x1 = input.nextInt();
        System.out.print("Enter the x2 co-ordinate : ");
        double x2 = input.nextInt();
        System.out.print("Enter the y1 co-ordinate : ");
        double y1 = input.nextInt();
        System.out.print("Enter the y2 co-ordinate : ");
        double y2 = input.nextInt();


        double length =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first line co-ordinates");
        Double length1 = lineLength();
        System.out.println("Length of first line : "+length1);
        System.out.println("Enter the second line co-ordinates");
        Double length2 = lineLength();
        System.out.println("Length of Second line : "+length2);
    }
}
