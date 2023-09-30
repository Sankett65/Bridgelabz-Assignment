package com.bridgelabz.assignment.day2.if_else;

import com.bridgelabz.assignment.day1.Utiity;

public class SingleDigit {
    public static void main(String[] args) {
        int x = Utiity.scannerint();
        read(x);
    }

    private static void read(int x) {
        if (x==1){
            System.out.println("One");
        } else if (x==2) {
            System.out.println("Two");
        } else if (x==3) {
            System.out.println("Three");
        } else if (x==4) {
            System.out.println("Four");
        } else if (x==5) {
            System.out.println("Five");
        } else if (x==6) {
            System.out.println("Six");
        } else if (x==7) {
            System.out.println("Seven");
        } else if (x==8) {
            System.out.println("Eight");
        } else if (x==9) {
            System.out.println("Nine");
        }else {
            System.out.println("Invalid Input");
        }

    }


}
