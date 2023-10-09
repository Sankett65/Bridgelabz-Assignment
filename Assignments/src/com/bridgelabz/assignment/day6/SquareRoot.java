package com.bridgelabz.assignment.day6;

import com.bridgelabz.assignment.day1.Utiity;


import java.util.ArrayList;

import java.util.List;


public class SquareRoot {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = Utiity.scannerInt();
       tobinary(n);
    }



    private static void tobinary(int n) {
        int i =2;
        int temp=0;
        int x = n;
        List<Integer> list = new ArrayList<>();
        StringBuilder binar = new StringBuilder();
        while ( n>0){
            if (n%i==0){
                binar.append('0');
                list.add(0);
                temp++;
            }else{
                binar.append('1');
                list.add(1);
                temp++;
            }
            n=n/2;
        }

        System.out.println("Binary representation of "+x +" is :-"+binar.reverse());

       if (binar.length()<8){
           binar.append(0);
           list.add(list.size(),0);
       }
        int mid = (list.size()/2);


        for(int j=0;j<list.size()/2;j++) {
            Integer temp1 = list.get(j);
            list.set(j, list.get(mid+j));

            list.set(j+mid, temp1);

        }
        System.out.println("After Swaping the nibles we get:- "+list);

        int res =0;
        int count=0;
        for (int k =0;k<list.size();k++){
            int a = (int) list.get(k);
            int sum = (int) (Math.pow(2,count)*a);
             res = res + sum;
             count++;
        }
        System.out.println("The decimal representation of "+list+" is :-"+res);

    }
}
