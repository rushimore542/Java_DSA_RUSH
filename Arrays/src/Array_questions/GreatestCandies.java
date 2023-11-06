package Array_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args)
    {
        int[] candies2={2,3,5,1,3};
        int extracandies1=3;
        System.out.println(KidsWithCandies(candies2,extracandies1));
    }
    static List<Boolean> KidsWithCandies(int[] candies, int extraCandies)
    {
        int[] a=candies.clone();
        Arrays.sort(a);
        int maxcandy=a[a.length-1];
        List<Boolean> ans=new ArrayList<>() {};
        for (int i = 0; i <candies.length ; i++) {
            int currsum=0;
            currsum=candies[i]+extraCandies;
            if(currsum < maxcandy)
            {
                ans.add(false);
            }

            if(currsum>=maxcandy)
            {
                ans.add(true);
            }
        }
        return ans;
    }
}
