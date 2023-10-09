package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        reverse(n);
    }

    private static void reverse(int n) {
        int reverse=0;
        while (n!=0){
            int remainder = n%10;
            reverse= (reverse*10)+remainder;
            n = n/10;
        }
        System.out.println(reverse);
    }
}
