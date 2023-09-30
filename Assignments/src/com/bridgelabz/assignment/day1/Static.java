package com.bridgelabz.assignment.day1;

public class Static {
    static String str1 = "Car class";
    public static void main(String[] args) {
        System.out.println(Static.str1);
        car();

    }

    private static void car() {
        String str = Utiity.scannerString();

        System.out.println("Cars Name is: "+str);
    }
    static {
        System.out.println("Hi");
    }
}
