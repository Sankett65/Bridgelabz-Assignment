package com.bridgelabz.assignment.day2.operator;

import com.bridgelabz.assignment.day1.Utiity;

public class TwoNumber {
    public static void main(String[] args) {
        int a= Utiity.scannerint();
        int b =Utiity.scannerint();
        operation(a,b);
    }

    private static void operation(int a, int b) {
        int c = a=b;
        int operation1=a+b*c;
        int operation2=c+a/b;
        int operation3=a%b+c;
        int operation4=a*b+c;
        System.out.println("Opeation1= "+operation1+"\n"+"Opeation2= "+operation2+"\n"+"Opeation3= "+operation3+"\n"+"Opeation4= "+operation4);
    }
}
