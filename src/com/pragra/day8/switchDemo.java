package com.pragra.day8;

import java.util.Scanner;

public class switchDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch(month){
            case 1:
            case 2:
                System.out.println("31 days");
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
}
