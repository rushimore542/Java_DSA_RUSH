package Array_questions;

public class NumbersWithEvenDigits {
    public static void main(String[] args)
    {
        int[] nums1={12,345,2,6,7896};
        System.out.println(numberwithEvenDigits(nums1));
    }
    static int numberwithEvenDigits(int[] nums)
    {
        int CountOfnumbers=0;
        int count=0;
        for (int i = 0; i <nums.length ; i++) {


            while(nums[i]>0)
            {
                 int rem=nums[i]%10;
                 nums[i]/=10;
                 count++;
            }
            if(count/2==0)
            {
                CountOfnumbers++;
            }

        }
        return CountOfnumbers;
    }
}
