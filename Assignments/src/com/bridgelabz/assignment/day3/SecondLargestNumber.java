package com.bridgelabz.assignment.day3;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] arr = {1,8,7,4,9,3,6};
        secondlargest(arr);
    }

    private static void secondlargest(int[] arr) {
        int max= Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                secMax=max;
                max=arr[i];
            }
        }
        System.out.println(secMax);
    }
}
