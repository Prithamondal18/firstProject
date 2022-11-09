package com.pragra.day9;

public class TwoDArray2 {
        public static void main(String[] args) {
            int marks[][] = {{1, 2, 3},
                             {2, 4, 5},
                             {4, 5, 6},
                             {6, 7, 8},
                             {5, 3, 5}};
            int sum;
            for (int i = 0; i < marks[0].length; i++) {
                sum = 0;
                for (int j = 0; j < marks.length; j++) {
                    sum = sum + marks[j][i];
                }
                System.out.println("Total sum of " + i + " coloum is " + sum);
                System.out.println("Average of " + i + " coloum is " + (sum / marks.length));
                System.out.println("-----------------------------------------------");
                System.out.println("vivek changes");
            }

        }
    }

