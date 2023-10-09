package com.bridgelabz.assignment.day2.operator;

import com.bridgelabz.assignment.day1.Utiity;

public class Spring {
    public static void main(String[] args) {
        int m= Utiity.scannerInt();
        int d = Utiity.scannerInt();
        spring(m,d);
    }

    private static void spring(int m, int d) {
        boolean check=m >=3 && d>=20 && d<=31 || m==4 && d>=1 && d<=30 ||  m==5 && d>=1 && d<=31 ||  m==6 && d<=20;
        System.out.println(check);
    }


}
