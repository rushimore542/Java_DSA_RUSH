package com.Rushikesh;

import java.util.Scanner;

public class Largest_amongst_all_number {
    public static void main(String[] args ){
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner in=new Scanner(System.in);
        int number= in.nextInt();
        int max,n;
        max=number;
        do {
            n=in.nextInt();
            if (max<n){
                max=n;
            }
        }while(n!=0);
        System.out.println("The largest number amongst all entered numbers is : "+max);
    }
}
