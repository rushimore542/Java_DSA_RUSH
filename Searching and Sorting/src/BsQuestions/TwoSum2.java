package BsQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args)
    {
        int[] nums={2,7,11,15};
        int target=18;
        System.out.println(Arrays.toString(findingtarget(nums,target)));

    }
    static int[] findingtarget(int[] arr,int target)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        while (left<right)
        {
            int cursum=arr[left]+arr[right];
            if(cursum==target)
            {
                return new int[]{left+1,right+1};
            }
            if(cursum>target)
            {
                right-=1;
            }
            else
            {
                left+=1;
            }
        }
        return new int[]{-1,-1};
    }
}
