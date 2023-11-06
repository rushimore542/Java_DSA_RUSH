package com.Rushikesh;

public class OrderagnosticBS {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int[] nums2={88,56,45,37,25,12,9,6,5,2};
        int target1=9;
        int ans=orderAgnosticBS(nums2,target1);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr,int target)
    {

        int start=0;
        int end= arr.length-1;
        boolean IsAsc=arr[end]>arr[start];
        while(start<=end){
            int mid=start+(end-start)/2;
             if(target==arr[mid]) {
                return mid;
            }
             if(IsAsc)
             {
                 if(target<arr[mid])
                 {
                     end=mid-1;
                 }
                 else if(target>arr[mid])
                 {
                     start=mid+1;
                 }
             }
             else
             {
                 if(target>arr[mid])
                 {
                     end=mid-1;
                 }
                 else if(target<arr[mid])
                 {
                     start=mid+1;
                 }
             }


        }

        return -1;
    }
}
