package com.Rushikesh;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int[] arr1=new int[len];
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]= in.nextInt();
        }
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void reverse(int[] arr)
    {
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1, int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
