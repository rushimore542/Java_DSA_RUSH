package com.Rushikesh;

import java.util.Scanner;

public class Greating {
    public static void main(String[] args) {
    int addition=sum2();
        System.out.println("The addition is "+addition);
        String sent=greating();
        System.out.println(sent);
    }
    static int sum2()
    {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int sum=m+n;
        return sum;
    }
    static String greating(){
        String great="How are you";
        return great;
    }
}
