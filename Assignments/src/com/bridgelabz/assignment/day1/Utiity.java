package com.bridgelabz.assignment.day1;

import java.util.Scanner;

public class Utiity {

    public static String scannerString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        return str;
    }
    public static int scannerint(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        return x;
    }
    public static char scannerchar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Charater: ");
        char x = sc.nextLine().charAt(0);
        return x;
    }
}
