package Array_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayFormdToInteger {
    public static void main(String[] args)
    {
        int[] nums={9,9,9,9,9,9,9,9,9,9};
        int Kl=1;
//        List<Integer> Ans1=new ArrayList<>();
//        Ans1=addToArrayForm(nums,Kl);
        List<Integer> Ans2=new ArrayList<>();
        Ans2=AddtoArrayFormedInteger(nums,Kl);
        for (int i:Ans2
             ) {
            System.out.print(i);

        }
//
//        for (int i:Ans1) {
//            System.out.print(i);
//
//        }

    }
    static List<Integer> AddtoArrayFormedInteger(int[] nums, int k)
    {
        List<Integer> Ans =new ArrayList<>();
      int arrtonum=0;
        for (int i:nums
             ) {
            arrtonum=arrtonum*10+i;

        }
        int ans=arrtonum+k;
        while(ans>0)
        {
            int rem=ans%10;
            ans/=10;
            Ans.add(rem);
        }
        Collections.reverse(Ans);
        return Ans;
    }

    static List<Integer> addToArrayForm(int[] num, int k) {

        int N = num.length;
        int cur = k;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += num[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }


}
