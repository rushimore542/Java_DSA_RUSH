package com.Rushikesh;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_largest_in_array {
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
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("Smallest element is "+arr1[0]);
        System.out.println("Largest element is "+arr1[arr1.length-1]);
    }
}
