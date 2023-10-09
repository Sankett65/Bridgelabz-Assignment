package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = Utiity.scannerInt();
        prime(n);
    }

    private static void prime(int n) {
        for (int i =2;i<=n;i++){
            int counter=1;
            for (int j =2;j<=i/2;j++){
                if (i%j==0){
                  counter++;
                }
            }
            if (counter==1){
                System.out.println(i);
            }
        }
    }
}
