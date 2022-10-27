package com.pragra.day5;

import java.util.*;

public class conditional {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value for x: ");
        x=sc.nextInt();
        if(x>10 && x<20){
            System.out.println("lucky number");
        }
    }
}
