package SortingQuestions;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,0,0,0};
        int m=3;
        int[] arr={2,5,6};
        int n=3;
        merge(nums,m,arr,n);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result=new int[m+n];
        System.arraycopy(nums1, 0, result, 0, m);
        System.arraycopy(nums2, 0, result, m, n);
        //System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
