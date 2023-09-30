package com.bridgelabz.assignment.day3;

public class Frequency {
    public static void main(String[] args) {
        int [] arr = {1,3,2,3,1,4,5,5,6,3,3,3};
        frequency(arr);
    }

    private static void frequency(int[] arr){
        boolean[] fre=new boolean[arr.length];
        for (int i =0;i< arr.length;i++){
            int count=1;
            if (fre[i]==true)
                continue;
            for (int j =i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    fre[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);


        }
    }
}
