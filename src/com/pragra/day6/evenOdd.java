package com.pragra.day6;

import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print(" It is Even number");
        } else {
            System.out.print(" It is Odd number");
        }
    }
}
