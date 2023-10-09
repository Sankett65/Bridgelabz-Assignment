package com.bridgelabz.assignment.day2.if_else;

import com.bridgelabz.assignment.day1.Utiity;

public class ReadNumber {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        readNumber(n);
    }

    private static void readNumber(int n) {
        if (n>=0 && n<10){
            System.out.println("Unit");
        } else if (n>=10 && n<100) {
            System.out.println("Tens");
        } else if (n>=100 && n<1000) {
            System.out.println("Hundred");
        }else {
            System.out.println("Invalid Input");
        }
    }
}
