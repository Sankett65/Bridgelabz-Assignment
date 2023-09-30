package com.bridgelabz.assignment.day3;

public class Smallest {
    public static void main(String[] args) {
        int arr [] = {1,4,2,5,3,1,9};
        largest(arr);
    }

    private static void largest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i =0;i< arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Largest Element is: "+min);
    }
}
