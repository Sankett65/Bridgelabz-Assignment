package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class Triplets {
    public static void main(String[] args) {
        int n =Utiity.scannerInt();
        int [] arr = new int[n];
        System.out.println("Enter the Array Elment");
        int count=6;
        for (int i =0;i<arr.length;i++){
            arr[i]= Utiity.scannerInt();
            count--;
            System.out.println(count+" are left to enter");
        }
        triplets(arr);
    }

    private static void triplets(int[] arr) {
        for (int i =0;i<arr.length;i++){
            for (int j =0;j< arr.length;j++){
                for (int k =0;k< arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }

}
