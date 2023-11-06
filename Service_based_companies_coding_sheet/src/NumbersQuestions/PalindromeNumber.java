package NumbersQuestions;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        int n=123;
        int result=reverse(n);
        if(result==n)
        {
            System.out.println("Number is Palindrome: "+n);
        }
        else
        {
            System.out.println("Number is not palindrome:"+n);
        }

    }
    static int reverse(int n)
    {
        int reverseNo=0;
        while(n>0)
        {
            int dig=n%10;
            reverseNo=reverseNo*10+dig;
            n/=10;
        }
        return reverseNo;
    }
}
