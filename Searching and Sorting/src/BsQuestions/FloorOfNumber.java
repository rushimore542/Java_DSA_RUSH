package BsQuestions;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=8;
        int ans=FloorNumber(nums,target);
        System.out.println(ans);
    }
    static int FloorNumber(int[] arr,int target)
    {
        // Floor number:Number which is greatest number smaller or eqaul to target[<=terget]
        int start=0;
        int end= arr.length-1;

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

        return end;
    }


}
