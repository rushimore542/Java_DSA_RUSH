package BsQuestions;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class FindPositionInSortedInfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target)
    {
        //first find the range
        //Lets start with first two number then increase the box size by multiplying the previous box size.
        int start=0;
        int end=1;
        //condition for terget lie in range
        while(target>arr[end])
        {
            int newstart=end+1;//this will be new start for next box range
            //double the box size.
            //end=end+(end-start+1)*2;
            // i.e. if previous start=0 and end=1 the new start will be 2 and end will be(1+(1-0+1)*2=5)i.e 5
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target,int start,int end)
    {

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

        return -1;
    }

}
