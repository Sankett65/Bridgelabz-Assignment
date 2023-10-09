package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;

public class VendingMachine {
    public static void main(String[] args) {
          int [] arr ={1,2,5,10,50,100,500,1000};
          int target= Utiity.scannerInt();
          vendingMachine(arr,target);
    }

    private static void vendingMachine(int[] arr,int target) {
        int sum =0;
        for (int i = arr.length-1;i>=0;i--){
            int count=0;
            while(arr[i]<=target){
                target=target-arr[i];
                sum++;
                count++;
            }
            System.out.println("No of notes of "+arr[i]+"  :"+count);
        }
        System.out.println("Total No of notes "+sum);
    }
}
