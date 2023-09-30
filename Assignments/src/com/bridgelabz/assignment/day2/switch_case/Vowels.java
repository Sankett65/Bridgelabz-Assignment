package com.bridgelabz.assignment.day2.switch_case;

import com.bridgelabz.assignment.day1.Utiity;

public class Vowels {
    public static void main(String[] args) {
        char n = Utiity.scannerchar();
        vowel(n);
    }

    private static void vowel(char n) {
        switch (n){
            case 'a':
                System.out.println("It is an Vowel");
                break;
            case 'e':
                System.out.println("It is an Vowel");
                break;
            case 'i':
                System.out.println("It is an Vowel");
                break;
            case 'o':
                System.out.println("It is an Vowel");
                break;
            case 'u':
                System.out.println("It is an Vowel");
                break;
            default:
                System.out.println("It is not and Vowel");
        }
    }
}
