package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class Power {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        power(n);
    }

    private static void power(int n) {

        if (n>0 && n<31){
            for (int i =1;i<=n;i++){
               int a = (int) Math.pow(2,i);
                System.out.println(a);
            }
        }else {
            System.out.println("Invalid Input");
        }
    }
}
