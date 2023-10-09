package com.bridgelabz.assignment.day2.for_loop;

import com.bridgelabz.assignment.day1.Utiity;

public class Palindrome {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        reverse(n);
    }

    private static void reverse(int n) {
        int temp=n;
        int reverse=0;
        for (;n!=0;){
            int remainder=n%10;
            reverse = (reverse*10)+remainder;
            n = n/10;
        }
        if (reverse==temp){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not a Palindrome");
        }

    }
}
