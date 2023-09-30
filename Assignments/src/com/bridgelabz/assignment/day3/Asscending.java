package com.bridgelabz.assignment.day3;

public class Asscending {
    public static void main(String[] args) {
        int [] arr ={10,4,8,9,2,6,3,5,1,7};
        assc(arr);
    }

    private static void assc(int[] arr) {
        for (int i =0;i< arr.length;i++){
           for (int j =i+1;j<arr.length;j++){
               if (arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
