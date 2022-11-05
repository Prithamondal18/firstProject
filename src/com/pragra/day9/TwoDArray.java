package com.pragra.day9;

public class TwoDArray {
    public static void main(String[] args) {

        int[][]  arr  =new int[3][4];
        arr[0][0]=10;   arr[0][1]=20;   arr[0][2]=30;   arr[0][3]=40;
        arr[1][0]=20;   arr[1][1]=10;   arr[1][2]=10;   arr[1][3]=10;
        arr[2][0]=30;   arr[2][1]=10;   arr[2][2]=10;   arr[2][3]=10;

        int sum;


        for (int i=0;i< arr[0].length;i++){

            sum=0;
            for (int j=0;j< arr.length;j++){
                sum=sum+arr[j][i];

            }
            System.out.println(sum);
        }



    }
}
