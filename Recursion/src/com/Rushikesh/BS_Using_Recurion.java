package com.Rushikesh;

public class BS_Using_Recurion {
    // Binary search using recursion
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6};
        int target=4;
        int index=BS(nums,target,0,nums.length-1);
        System.out.println(index);

    }
    static int BS(int[] arr,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;

        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(target<arr[mid])
        {
            return BS(arr,target,s,mid-1);
        }
        return BS(arr,target,mid+1,e);
    }
}
