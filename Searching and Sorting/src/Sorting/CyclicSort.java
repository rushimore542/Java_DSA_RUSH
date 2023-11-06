package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] nums={3,5,2,1,4};
        cycsort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void cycsort(int[] arr){
        int i=0;
        while(i< arr.length)
        {
            int correctindex=arr[i]-1;
            if (arr[i]!=arr[correctindex])
            {
                swap(arr,i,correctindex);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
