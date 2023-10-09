package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class LeapYear {
    public static void main(String[] args) {
        int year = Utiity.scannerInt();
        leapyear(year);
    }

    private static void leapyear(int year) {
        if (year>1000 ) {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("It is an Leap Year");
            } else {
                System.out.println("It is not an Leap year");
            }
        }else {
            System.out.println("Invalid Input");
        }
    }
}
