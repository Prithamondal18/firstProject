package com.pragra.day8;

public class ArrayDemo {
    public static void main(String[] args) {


        int[] arr= new int[5];
        arr[0] =10;              //indexes
        arr[1]=10;
        arr[2]=10;
        arr[3]=10;
        arr[4]=10;

        for(int i=0;i<=4;i++){                  //i=0 bcz arr is 0, bcz array index always start with 0

            arr[i]=10;

        }

        for(int i=0;i<=4;i++){                  //i=0 bcz arr is 0, bcz array index always start with 0

            arr[i]=10;
            System.out.println(arr[i]);
        }


    }
}
