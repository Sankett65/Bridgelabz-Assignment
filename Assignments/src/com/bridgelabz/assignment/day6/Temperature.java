package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;

public class Temperature {
    public static void main(String[] args) {
//        ctof();
//        ptoc();
        temperatureConversion();
    }

    private static void temperatureConversion() {
        System.out.println("Enter 1 to convert Celsius to Fahrenheit");
        System.out.println("Enter 2 to convert  Fahrenheit to Celsius");
        int check=Utiity.scannerInt();
        switch (check){
            case 1:
                ctof();
                break;
            case 2:
                ftoc();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    private static void ctof( ) {
//        Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
//        Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
        double c = Utiity.scannerDouble();
                double f = (c*9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+f +" degree");
    }

    private static void ftoc() {
            double f= Utiity.scannerDouble();
            double c = (f-32)*5/9;
        System.out.println("Temperature in Calsius: "+c+" degree");
    }
}
