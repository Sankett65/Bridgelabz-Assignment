package com.bridgelabz.assignment.day1;

public class TwoStringEquality {

    public static void main(String[] args) {
        String str1=Utiity.scannerString();
        String str2=Utiity.scannerString();
        equality(str1,str2);
    }

    private static void equality(String str1, String str2) {
//        if (str1==str2){
//            System.out.println("Two String are Equal");
//        }else {
//            System.out.println("Two String are not Equal");
//        }
        if (str1.equals(str2)){
            System.out.println("Two String are Equal");
        }else {
            System.out.println("Two String are not Equal");
        }
    }
}
