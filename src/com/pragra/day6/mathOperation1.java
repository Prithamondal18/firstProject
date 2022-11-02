package com.pragra.day6;

public class mathOperation1 {
    public static void main(String[] args) {

       fibonacci(0,1,7);
        factorial(5,1);
    }



    public static int fibonacci(int num1,int num2,int n){
        num1=0;
        num2=1;
        int i;
        int sum;
        for(i=0;i<n;i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.println(sum);
        }
        return n;
    }
    public static int factorial(int fac,int i){
            int n=1;
        for( i=1;i<fac;i++){
            n=i*n;
            System.out.println("the factorial of a number is "+n);
        }
        return n;

    }

}
