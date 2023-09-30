package com.bridgelabz.assignment.day3;

public class Duplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4,1,4,6,2,5,7,9,8};
        duplicateElement(arr);
    }

    private static void duplicateElement(int[] arr) {
        for (int i =0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
