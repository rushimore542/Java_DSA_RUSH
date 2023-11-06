package Array_questions;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain={-4,-3,-2,-1,4,3,2};
        int HighestAlt=largestAltitude(gain);
        System.out.println(HighestAlt);
    }
    static int largestAltitude(int[] nums) {
        int sum=0;
        int[] nums1 = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            sum=sum+nums[i];
            nums1[i]=sum;
        }
        Arrays.sort(nums1);
        return nums1[nums1.length-1];
    }
}
