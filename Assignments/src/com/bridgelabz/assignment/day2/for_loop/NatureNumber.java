package com.bridgelabz.assignment.day2.for_loop;

import com.bridgelabz.assignment.day1.Utiity;

public class NatureNumber {
    public static void main(String[] args) {
       int n = Utiity.scannerint();
        natural(n);
    }

    private static void natural(int n) {
        int sum=0;
        for (int i =1;i<=n;i++){
            System.out.println();
            System.out.print(sum+"+"+i+"=");
            sum = sum + i;
            System.out.print(sum+" ");
        }
    }
}
