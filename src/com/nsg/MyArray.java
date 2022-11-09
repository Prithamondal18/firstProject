package com.nsg;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.println("Enter a value at arr["+i+"]:");
            arr[i]=sc.nextInt();

        }
        System.out.println("the array elements are as follow: ");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
