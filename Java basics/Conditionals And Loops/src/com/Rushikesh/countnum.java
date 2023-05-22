package com.Rushikesh;

import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        int n,rem,count=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        rem=in.nextInt();
        while(n>0){
            int temp=n%10;
            if(temp==rem)
            {
                count++;
            }
            n/=10;
        }
        System.out.println("the count is "+count);
    }
}
