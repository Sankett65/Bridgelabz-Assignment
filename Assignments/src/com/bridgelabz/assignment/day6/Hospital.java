package com.bridgelabz.assignment.day6;

public class Hospital {
    public void patient(){
        System.out.println("Name of patient");
    }

    public static void main(String[] args) {
        Hospital h = new Hospital();
        Hospital h1 = new Hospital();
        h.patient();
        h1.patient();
    }
}
