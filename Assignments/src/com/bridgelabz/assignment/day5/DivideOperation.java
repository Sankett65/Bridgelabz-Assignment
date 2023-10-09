package com.bridgelabz.assignment.day5;

public class DivideOperation {
    public static void main(String[] args) {
        division();
    }

    private static void division() {
      int divident = 7;
      int divisior = 2;
        int quoetient= divident/divisior;
        int remainder =divident/(divisior*quoetient);
        System.out.println("Quoteint is : "+quoetient);
        System.out.println("Remainder is : "+remainder);
    }
}
