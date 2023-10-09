package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        evenOdd(n);
    }

    private static void evenOdd(int n) {
        if (n%2==0){
            System.out.println("The Number is Even");
        }else {
            System.out.println("The Number is Odd");
        }
    }
}
