package com.Rushikesh;

import java.util.Arrays;

public class Running_sum_1dArray {
    public static void main(String[] args) {
        //Input: nums = [1,2,3,4]
        //Output: [1,3,6,10]
        int[] nums={1,2,3,4};
        RunningSumOf1dArray(nums);


    }
    public static void RunningSumOf1dArray(int[] arr)
    {
        int[] sum = new int[arr.length];
         sum[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
