package com.pragra.day4;
import java.util.*;

public class calculator2 {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value for a: ");
            a=sc.nextInt();
        System.out.print("enter the value for b: ");
            b=sc.nextInt();
        System.out.println("sum of two number: " + sum(a,b));
        System.out.println("subtraction of two number: " + sub(a, b));
        System.out.println("multiplication of two number: " + multi(a, b));
        System.out.println("division of two number: "+div(a,b));
        System.out.println("average of two number: "+avg(a,b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a*b;
    }
    public static double div(double a, double b) {
        return a/b;
    }

    public static double avg(double a, double b){return ((a+b)/2);}
}
