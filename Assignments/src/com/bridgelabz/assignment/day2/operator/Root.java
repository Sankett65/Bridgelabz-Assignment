package com.bridgelabz.assignment.day2.operator;

import com.bridgelabz.assignment.day1.Utiity;

public class Root {
    public static void main(String[] args) {


    int a = Utiity.scannerInt();
    int b = Utiity.scannerInt();
    int c =Utiity.scannerInt();
    quadratic(a,b,c);

}

    private static void quadratic(int a, int b,int c) {
        double delta= (b*b) -(4*a*c);
        double square=Math.sqrt(delta);
        double root1 = -(b + square)/2*a;
        double root2= -(b - square)/2*a;

       System.out.println("Roots are : "+root1+"\n            "+root2);
    }
}
