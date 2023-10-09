package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class Swap {
    public static void main(String[] args) {
        int a = Utiity.scannerInt();
        int b = Utiity.scannerInt();
        swap(a,b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
