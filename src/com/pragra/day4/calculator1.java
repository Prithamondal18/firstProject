package com.pragra.day4;

public class calculator1 {

    public static void main(String[] args) {

        int addresult= sum(10,5);
        int subresult= sub(10,5);
        int multiresult= multi(10,5);
        double divresult= div(10,20);
        System.out.println("sum of two numbers: "+addresult);
        System.out.println("subtraction of two numbers: "+subresult);
        System.out.println("multiplication of two numbers: "+multiresult);
        System.out.println("division of two numbers: "+divresult);
    }

    public static int sum(int a, int b) {

        return a+b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static double div(double a, double b) {
        return a / b;
    }
}
