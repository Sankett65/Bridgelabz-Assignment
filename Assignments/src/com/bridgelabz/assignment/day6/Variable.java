package com.bridgelabz.assignment.day6;

public class Variable {
    int a = 10;
    static int b = 20;
    public static void add(){
        int c = 30;
        int d = 40;
        System.out.println(c+d);
    }

    public static void main(String[] args) {
        add();
        System.out.println("Static Variable: "+Variable.b);
    }

}
