package com.Rushikesh;

public class Even_odd {
    public static void main(String[] args)
    {
       int n=98;
        System.out.println(even_or_odd(n));

    }
    static boolean even_or_odd(int n)
    {
        return  (n & 1)==0;
    }
}
