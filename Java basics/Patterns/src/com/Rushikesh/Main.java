package com.Rushikesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        pattern5();
        pattern28(5);

    }
    static void pattern1()
    {
        Scanner nxt=new Scanner(System.in);
        int n=nxt.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int col = 1; col <=i ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void pattern2(){
        Scanner nxt=new Scanner(System.in);
        int n=nxt.nextInt();
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern3(){
        Scanner nxt=new Scanner(System.in);
        int n=nxt.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int col=1;col<=n-i+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(){
        Scanner nxt=new Scanner(System.in);
        int n=nxt.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int col=1;col<=i;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(){
        Scanner nxt=new Scanner(System.in);
        int n=nxt.nextInt();
        for(int i=1;i<2*n;i++)
        {
            int totalrowcount=i>n?2*n-i:i;
            for(int col=1;col<=totalrowcount;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){


        for(int row=0;row<2*n;row++)
        {
            int totalrowcount=row > n ? 2 * n-row:row;

            int noofspaces=n-totalrowcount;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }
            for(int col=0;col<totalrowcount;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

