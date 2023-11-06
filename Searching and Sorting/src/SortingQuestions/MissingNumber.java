package SortingQuestions;

public class MissingNumber {
    public static void main(String[] args) {
    int[] arr={3,4,1,0};
    int missing=missingnumber(arr);
        System.out.println(missing);
    }
    static int missingnumber(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {

            if(nums[i]<nums.length && nums[i]!=nums[nums[i]])
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
                return j;
            }
        }
        return nums.length;
    }
   static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
