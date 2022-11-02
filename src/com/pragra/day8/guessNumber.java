package com.pragra.day8;

import java.util.Scanner;

public class guessNumber {

    public static void main(String[] args) {
        int thoughtNo = (int) (Math.random() * 100);
        System.out.println("let's play the game....guess number");
        Scanner sc = new Scanner(System.in);
        int guessNo = sc.nextInt();

        while (thoughtNo != guessNo) {
            if (thoughtNo < guessNo) {
                System.out.println("wrong number...keep guessing");
                System.out.println("you are guessing little high");
                guessNo = sc.nextInt();
            } else if (thoughtNo > guessNo) {
                System.out.println("you are guessing little less");
                guessNo = sc.nextInt();
            } else{
                System.out.println("right number");
            }
        }
    }
}