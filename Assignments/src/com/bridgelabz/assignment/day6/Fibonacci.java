package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;

public class Fibonacci {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        fibonacii(n);
    }

    private static void fibonacii(int n) {
        int x =0;int y =1;
        int z = x+y;
        System.out.print(x+" "+y);
        for (int i =2;i<n;i++){
            z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;

        }
    }
}
