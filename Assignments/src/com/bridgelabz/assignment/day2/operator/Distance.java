package com.bridgelabz.assignment.day2.operator;

import com.bridgelabz.assignment.day1.Utiity;

public class Distance {
    public static void main(String[] args) {
        int x = Utiity.scannerint();
        int y=Utiity.scannerint();
        distance(x,y);
    }

    private static void distance(int x, int y) {
       double distance = Math.sqrt(x*x + y*y);
        System.out.println("Distance from origin: "+distance);
    }
}
