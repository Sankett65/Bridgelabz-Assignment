package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponNumber {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        coupon(n);
    }

    private static void coupon(int n) {
        int count=0;
        Set set=new HashSet<>();
        Random r = new Random();
        while (set.size() <n) {
            count++;
            int x = r.nextInt(n);
            if (!set.contains(x)){
                set.add(x);

                System.out.println("The Coupon number is :- " + x);
            }

        }
        System.out.println("Total Coupon Number Genetrated :- "+count);

    }
}
