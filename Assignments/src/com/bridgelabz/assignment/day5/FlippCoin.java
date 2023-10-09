package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

import java.util.Random;

public class FlippCoin {
    public static void main(String[] args){
         int n = Utiity.scannerInt();
         flipcoin(n);
    }

    private static void flipcoin(int n) {
        int headCount=0;
        int tailCount=0;
        for (int i = 0; i < n; i++) {
            Random r = new Random();
            int x = r.nextInt();
            if (x < 0.5) {
               // System.out.println("Head");
                headCount++;
            } else {
               // System.out.println("Tails");
                tailCount++;
            }
        }
        System.out.println("Percentage of Head is : "+(headCount*100)/n);
        System.out.println("Percentage if Tails is : "+(tailCount*100)/n);
    }
}
