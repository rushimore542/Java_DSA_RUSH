package com.Rushikesh;

import java.util.Arrays;

public class concat_of_Array {
    public static void main(String[] args) {
        int[] nums2={1,2,3,4};
        int[] nums3= getConcatenation(nums2);
        System.out.println(Arrays.toString(nums3));
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int k=0;

            for (int i = 0; i < nums.length ; i++) {
                ans[i]=nums[i];
            }
        for (int i = 0; i <  nums.length; i++) {
            ans[i+ nums.length] =nums[i];        }

    return ans;
    }

}
