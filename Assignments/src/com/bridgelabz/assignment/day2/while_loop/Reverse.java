package com.bridgelabz.assignment.day2.while_loop;

import com.bridgelabz.assignment.day1.Utiity;

public class Reverse {
    public static void main(String[] args) {
        int n = Utiity.scannerint();
        reverse(n);
    }

    private static void reverse(int n) {
        int reverse=0;
        while (n>0){
            int a = n%10;
            reverse= (reverse*10)+a;
            n = n/10;
        }
        System.out.println(reverse);
    }
}
