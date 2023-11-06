package BsQuestions;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=8;
        int ans=Ceiling(nums,target);
        System.out.println(ans);
    }
    static int Ceiling(int[] arr, int target)
    {
        // Ceiling number is number that is smallest number greater or equal to target

        int start=0;
        int end= arr.length-1;
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else {
                return mid;
            }
        }

        return arr[start];
    }
}
