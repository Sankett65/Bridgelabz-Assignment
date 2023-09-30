package com.bridgelabz.assignment.day3;

public class Reverse {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        for (int i =0;i<arr.length;i++){
            int temp1=arr[i];
            int temp2=arr[arr.length-i-1];
            temp1=temp2;

            System.out.println(temp1);
        }
    }
}
