package com.Rushikesh;

import java.util.Arrays;
import java.util.Scanner;

public class Array_is_sorted_or_not {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length=in.nextInt();
        int[] arr1=new int[length];
        System.out.println("enter the array elements");
        for (int a = 0; a < arr1.length ; a++) {
            arr1[a]= in.nextInt();
        }
        System.out.println("The array elements are:");
            System.out.println(Arrays.toString(arr1));
        System.out.println(SortedOrNot(arr1));

    }
    public static boolean SortedOrNot(int[] arr){
        boolean Ans=true;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    Ans=false;

                }

            }

        }
        return Ans;
    }

}
