package com.pragra.day6;
import java.util.*;
public class factorial {
        public static void main(String args[]) {
            int fac,n,i=1;
            Scanner sc=new Scanner (System.in);
            System.out.print(" factorial of which number");
            fac=sc.nextInt();

            for(n=1;n<=fac;n++) {
                i=n*i;

            }
            System.out.print("Factorial of a number: " +i);
        }
}

