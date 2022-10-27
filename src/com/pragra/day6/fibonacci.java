package com.pragra.day6;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {

        int num1=0,num2=1,i=0,sum,fab;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the fibonacci number: ");
        fab=sc.nextInt();
        for(i=0;i<fab;i++){

          sum=num1+num2;
          num1=num2;
          num2=sum;
          System.out.println(sum);

        }
    }
}
