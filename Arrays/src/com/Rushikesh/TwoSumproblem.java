package com.Rushikesh;

import java.util.Arrays;

//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
public class TwoSumproblem {
    public static void main(String[] args) {
        int[] nums={3,3};
        int target=6;
        int[] ans1=TwoSum(nums,target);
        System.out.println(Arrays.toString(ans1));

    }
    static int[] TwoSum(int[] arr,int target)
    {
        int[] ans=new int[2];




        for (int i = 0; i < arr.length ; i++)
        {
            for (int j = i+1; j < arr.length ; j++)
            {
                if (arr[i]+arr[j]==target)
                {
                ans[0]=i;
                ans[1]=j;
                }
            }
        }

        return ans;
    }
}
