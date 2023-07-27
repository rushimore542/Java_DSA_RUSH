package com.Rushikesh;

public class Linear_search {
    public static void main(String[] args){
    int[] nums={20,87,76,56,45,89,96};
    int target=56;
    int ans=linear_search(nums,target);
        System.out.println(ans);
    }
    static int linear_search(int[] arr,int target)
    {
        if (arr.length==0)
        {
            return -1;

        }
        for (int Index = 0; Index < arr.length ; Index++)
        {
            int element=arr[Index];
            if (element==target)
            {
                return Index;
            }
        }
        return -1;
    }
}
