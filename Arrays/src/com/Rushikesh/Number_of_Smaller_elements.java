package com.Rushikesh;
//1365. How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;

public class Number_of_Smaller_elements {
    public static void main(String[] args) {
       int[] nums1 = {6,5,4,8};
       int[] ans=smallerNumbersThanCurrent(nums1);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            int count=0;
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i]>nums[j]){
                    count++;
                }
             ans[i]=count;
            }
        }
        return ans;
    }

}
