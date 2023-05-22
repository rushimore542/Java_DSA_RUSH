package com.Rushikesh;

import java.util.Scanner;

public class Reverse_number
{
    public static void main(String[] args)
    {
        reverse();
    }
    static void reverse()
    {
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();
        int ans=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            n/=10;
            ans=ans*10+rem;
        }
        System.out.println("The reverse of numnber is "+ans);
    }
}
