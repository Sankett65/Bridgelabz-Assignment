package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        perfect(n);
    }

    private static void perfect(int n) {
        int sum=0;
        for (int i =1;i<n;i++){
            if (n%i==0){
                System.out.print(i+" ");
                sum = sum+i;
            }
        }
        if (sum==n){
            System.out.println("\nNumber is a Perfect Number");
        }else {
            System.out.println("\nNumber is not a perfect Number");
        }
    }
}
