package com.Rushikesh;

import java.util.Arrays;

public class Running_sum_of_1D_Array {
    public static void main(String[] args) {
        int[] nums2={1,2,3,4};
        int[] nums3= runningSum(nums2);
        System.out.println(Arrays.toString(nums3));
    }
    static int[] runningSum(int[] nums) {
        int sum=0;
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            sum=sum+nums[i];
            nums1[i]=sum;
        }
        return nums1;
    }
}
