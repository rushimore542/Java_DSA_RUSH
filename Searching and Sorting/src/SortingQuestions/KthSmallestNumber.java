package SortingQuestions;

import java.util.Arrays;

public class KthSmallestNumber {
    public static void main(String[] args) {
        int[] nums={7,10,3,4,20,15};
        int k=3;
        int ans=kthsmallestelement(nums,k);
        System.out.println(ans);
    }
    static int kthsmallestelement(int[] arr,int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
