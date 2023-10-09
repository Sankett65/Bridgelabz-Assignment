package com.bridgelabz.assignment.day3;

import com.bridgelabz.assignment.day1.Utiity;

public class PrintElement {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        print(n);
    }

    private static void print(int n) {
        for (int i =1;i<=n;i++){
            System.out.println(i);
        }
    }
}
