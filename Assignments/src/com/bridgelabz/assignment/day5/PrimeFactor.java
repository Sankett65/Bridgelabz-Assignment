package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class PrimeFactor {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        primeFactor(n);
    }

    private static void primeFactor(int n) {
        for (int i = 2; n > 1; i++) {
            while (n % i == 0) {
                System.out.println(" "+ i);
                n = n / i;
            }
        }
    }
}



