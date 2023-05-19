package com.bridglabz.FunctionalPrograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        distance1();
    }

    public static void distance1() {
        System.out.println("Enter the input coordinate x1 :");
    Scanner sc = new Scanner(System.in);
    int x1=sc.nextInt();
        System.out.println("Enter the input coordinate y1 : ");
        int y1=sc.nextInt();
        System.out.println("Enter the input coordinate x2: ");
        int x2=sc.nextInt();
        System.out.println("Enter the input coordinate y2: ");
        int y2=sc.nextInt();
        // Distance ...................................................
        int x=x2-x1;
        int y=y2-y1;
        double distance=Math.sqrt(x*x+y*y);
        System.out.println("Distance between two points: "+distance);
}
}
