package com.bridgelabz.assignment.day5;

import com.bridgelabz.assignment.day1.Utiity;

public class TwoDArray {
    public static void main(String[] args) {
        printarr();
    }

    private static void printarr() {
        System.out.print("Enter numbers of rows: ");
        int row = Utiity.scannerInt();
        System.out.print("Enter numbers of Coloumn: ");
        
        int coloumn= Utiity.scannerInt();
        int[][] arr = new int[row][coloumn];
        System.out.println("Enter a number you want to insert: ");
        for (int i =0;i<row;i++){
            for (int j =0;j<coloumn;j++){
                arr[i][j]=Utiity.scannerInt();
            }
        }
        for (int i =0;i<row;i++) {
            for (int j = 0; j < coloumn; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
