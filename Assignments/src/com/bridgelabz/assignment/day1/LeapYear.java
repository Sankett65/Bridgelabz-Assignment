package com.bridgelabz.assignment.day1;

public class LeapYear {
    public static void main(String[] args) {
        int year=Utiity.scannerint();
        leap(year);
    }

    private static void leap(int year) {
        if (year>=1582){
            if (year%4==0 && year%100!=0 || year%400==0){
                System.out.println("Year is Leap Year");
            }else {
                System.out.println("Year is ot a Leap Year");
            }
        }
             else {
                System.out.println("Invalid Year");
            }
        }
    }

