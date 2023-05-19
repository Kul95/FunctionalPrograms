package com.bridglabz.FunctionalPrograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        windChillMethod();
    }
    public static void windChillMethod(){
        System.out.println("Enter the input number: ");
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble();
        double v=sc.nextDouble();
        double w = 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
        System.out.println(w);

    }
}
