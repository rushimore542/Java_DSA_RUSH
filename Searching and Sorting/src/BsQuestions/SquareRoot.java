package BsQuestions;

public class SquareRoot {
    public static void main(String[] args)
    {
        int n=2147483647;
        int root=mysqrt(n);
        System.out.println(root);
    }
     static int mysqrt(int x)
    {
        int left=1;
        int Right=x;
        while(left<=Right)
        {
            long mid=left+(Right-left)/2;
            long square=mid*mid;
            if(square==(long)x){
                return (int) mid;
            }
            if(square<=(long)x)
            {
                left= (int)mid + 1;
            }
            else
            {
                Right= (int)mid-1;
            }
        }
        return Right;
    }
}
