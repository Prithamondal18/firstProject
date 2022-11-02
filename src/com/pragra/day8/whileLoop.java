package com.pragra.day8;

import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {


        int thoughtNo = (int) (Math.random() * 10);
        System.out.println("let's guess the number");
        System.out.println("you try guessing");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int guessNo = sc.nextInt();
            if (thoughtNo == guessNo) {
                System.out.println("u win");
                break;
            } else {
                System.out.println("loose");
            }
        }
    }
}


