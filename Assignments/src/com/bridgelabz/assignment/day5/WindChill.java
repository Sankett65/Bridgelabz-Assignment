package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class WindChill {
    public static void main(String[] args) {
        double temperature= Utiity.scannerDouble();
        double wind= Utiity.scannerDouble();
        effictiveTemperature(temperature,wind);

    }

    private static void effictiveTemperature(double temperature, double wind) {
        if (Math.abs(temperature)<=50 && wind>2 && wind<121){
            double w =35.74 + (0.6125*temperature)+((0.4275*temperature)-35.75)*Math.pow(wind,0.16);
            System.out.println("National Weather Service defines the effective temperature (the wind chill) to be: "+w);
        }else {
            System.out.println("Not Valid");
        }
    }
}
