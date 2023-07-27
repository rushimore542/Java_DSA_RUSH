package com.Rushikesh;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int[] arr1=new int[len];
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]= in.nextInt();
        }
        swap(arr1,3, 4);
        System.out.println(Arrays.toString(arr1));
    }
    static void swap(int[] arr,int index1, int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
