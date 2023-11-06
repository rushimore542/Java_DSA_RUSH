package BsQuestions;

public class SmallestLetter {
    public static void main(String[] args) {
    char[] arr={};
    }
    static int Ceiling(char[] Letters, char target)
    {
        // Ceiling number is number that is smallest number greater or equal to target

        int start=0;
        int end= Letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<Letters[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }

        return Letters[start% Letters.length];
    }
}
