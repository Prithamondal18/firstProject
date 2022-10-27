package com.pragra.day6;

public class practice1 {
    public static void main(String[] args) {
        testEvenOrOdd(20);

        testPositiveNegative(0);

        greatestof3(5,4,5);
    }
    public static void testEvenOrOdd(int x){
     if (x%2==0) {
         System.out.println("Even number");
     }
     else{
         System.out.println("Odd number");
     }
    }

    public static void testPositiveNegative(int x){
        if (x>0){
            System.out.println("positive");
        }
        else if (x<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("zero");
        }
    }

    public static void testMonthDays(int month){
        if(month==1){
            System.out.println("31");
        }
    }

    public static void greatestof3(int a,int b,int c){
        if (a>=b && a>=c){
            System.out.println("largest number" +a);
        }
        else if (b>=c && b>=a){
            System.out.println("largest number" +b);
        }
        else{
            System.out.println("largest number" +c);
        }
    }

    public static void checkElligible(boolean isactive){

    }

}
