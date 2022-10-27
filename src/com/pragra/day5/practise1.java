package com.pragra.day5;
//conditional operators using logical operands
import java.util.*;
public class practise1 {
    public static void main(String[] args) {

        int a, b, sum, doubleSum;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter te value of a:  ");
        a = sc.nextInt();
        System.out.print("enter te value of b:  ");
        b = sc.nextInt();
        sum = a + b;
        doubleSum = sum * 2;

        if (a == b) {
            System.out.println(doubleSum);
        } else {
            System.out.println(sum);
        }

    }
}
