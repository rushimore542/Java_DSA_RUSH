package com.Rushikesh;

import java.util.Arrays;
import java.util.Scanner;

public class Last_occurrance_of_element {
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
        System.out.println("The target element is");
        int element= in.nextInt();
        System.out.println("The last occurrance is "+lastoccurrance(arr1,element));
    }
    public static int lastoccurrance(int[] arr,int target)
    {
        int lastcount=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target)
            {
                lastcount=i;
            }
        }
        return lastcount;
    }
}
