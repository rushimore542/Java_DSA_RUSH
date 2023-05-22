package com.Rushikesh;

import java.util.Scanner;

public class largest_number_amongst_3 {
    public static void main(String[] args){
        Largest1(10,7,15);
        largest2();
        largest3(10,6,5);

    }
    static void Largest1(int m,int n,int c){
        int max;
        max=m;
        if (n>max)
        {
            max=n;
        }
        if (c>max)
        {
            max=c;
        }
        System.out.println("the largest is "+ max);
    }
    static void largest2()
    {
        Scanner input=new Scanner(System.in);
        int a,b,c,max;
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        max=0;
        if (b>a)
        {
            max=b;
        }
        else{
            max=a;
        }
        if (c>max)
        {
            max=c;

        }
        System.out.println("The Largest amongst the three is "+ max);
    }
    static void largest3(int a,int b,int c )
    {
        int max=Math.max(c,Math.max(a,b));
        System.out.println("The largest number from three numbers is "+max);
    }
}
