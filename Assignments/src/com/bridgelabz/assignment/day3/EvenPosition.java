package com.bridgelabz.assignment.day3;

public class EvenPosition {
    public static void main(String[] args) {
        int arr [] ={ 1,2,3,4,5,6,7,8,9,10};
        even(arr);
    }

    private static void even(int[] arr) {
        for (int i =1;i<=arr.length;i++){     //  for(int i =0;i<n;i=i+2)
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
