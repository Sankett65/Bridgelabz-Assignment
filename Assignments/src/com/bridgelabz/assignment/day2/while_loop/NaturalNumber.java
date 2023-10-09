package com.bridgelabz.assignment.day2.while_loop;

import com.bridgelabz.assignment.day1.Utiity;

public class NaturalNumber {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        natural(n);
    }

    private static void natural(int n) {
        int sum =0;
        while (n>0){
            sum=sum+n;
            n--;
        }
        System.out.println(sum);
    }
}
