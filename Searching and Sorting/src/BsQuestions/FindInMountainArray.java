package BsQuestions;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4,3,2};
        int target=6;
        System.out.println(searchinmountainarray(arr,target));
    }
    static int searchinmountainarray(int[] arr,int target)
    {
        int peakindex=peak(arr);
        int firsttry=orderAgnosticBS(arr,target,0,peakindex);
        if(firsttry!=-1)
        {
            return firsttry;
        }

        return orderAgnosticBS(arr,target,peakindex,arr.length-1);
    }
    static int peak(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=end+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end)
    {

        boolean IsAsc=arr[end]>arr[start];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]) {
                return mid;
            }
            if(IsAsc)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else if(target>arr[mid])
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else if(target<arr[mid])
                {
                    start=mid+1;
                }
            }


        }

        return -1;
    }
}
