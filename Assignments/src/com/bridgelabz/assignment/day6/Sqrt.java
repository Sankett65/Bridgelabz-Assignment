package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        double c = Utiity.scannerInt();
        sqrt(c);
    }

    private static void sqrt(double c) {
        if (c<0){
            System.out.println("Invaliad Input");
        }
         double t = c;
        double epsilon=1e-15;

        while (Math.abs(t - c/t) > epsilon*t){
            t = (c/t+t)/2;
        }

        System.out.println("Square Root of "+c+" is = "+t);
    }
}
