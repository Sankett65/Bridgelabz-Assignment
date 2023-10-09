package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class Harmonic {
    public static void main(String[] args) {
        int n= Utiity.scannerInt();
        harmonic(n);
    }

    private static void harmonic(int n) {
        for (int i =1;i<=n;i++){
            if (i==n){
                System.out.println("1/"+i);
                break;
            }
            System.out.print("1/"+i+" + ");
        }

    }
}
