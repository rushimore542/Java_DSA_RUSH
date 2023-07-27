package com.Rushikesh;

import java.util.Arrays;
import java.util.Scanner;

public class Occurrrance_of_element {
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
        int count1=occurrances(arr1,element);
        System.out.println("The count of element is "+count1);
    }
    public static int occurrances(int[] arr,int target)
    {
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target){
                count++;

            }
        }
        return count;
    }
}
