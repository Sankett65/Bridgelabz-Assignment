package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class LargestAmongThree {
    public static void main(String[] args) {
        int a= Utiity.scannerInt();
        int b = Utiity.scannerInt();
        int c = Utiity.scannerInt();
        largest(a,b,c);
    }

    private static void largest(int a, int b, int c) {
        if(a>b && a>c){
            System.out.println(a+" is Largest");
        }else  if(b>a && b>c){
            System.out.println(b+" is Largest");
        }else {
            System.out.println(c+" is Largest");
        }

    }
}
