package SortingQuestions;

public class FirstMissingPositive {
    public static void main(String[]args)
    {

    }
    static int missingnumber(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {

            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[nums[i]])
            {
                swap(nums,i,nums[i]);
            }
            else
            {
                i++;
            }
        }
        for (int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j)
            {
                return j+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
