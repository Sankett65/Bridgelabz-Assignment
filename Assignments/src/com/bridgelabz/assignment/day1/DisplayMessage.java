package com.bridgelabz.assignment.day1;

import java.util.Scanner;

public class DisplayMessage {
    public static void main(String[] args) {

        display();
    }

    private static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a message you want to display: ");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
