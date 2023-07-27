package com.Rushikesh;

public class Good_pairs {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int count=numIdenticalPairs(nums1);
        System.out.println(count);
    }
    static int numIdenticalPairs(int[] nums) {
        int[] ans=new int[nums.length];
        int count=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }

            }
        }
        return count;
    }
}
