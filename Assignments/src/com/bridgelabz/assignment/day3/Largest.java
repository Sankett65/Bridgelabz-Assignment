package com.bridgelabz.assignment.day3;

public class Largest {
    public static void main(String[] args) {
        int arr [] = {1,4,2,5,3,1,9};
        largest(arr);
    }

    private static void largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element is: "+max);
    }
}
