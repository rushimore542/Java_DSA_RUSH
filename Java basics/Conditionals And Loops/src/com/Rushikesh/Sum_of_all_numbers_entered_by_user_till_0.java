package com.Rushikesh;

import java.util.Scanner;

public class Sum_of_all_numbers_entered_by_user_till_0 {
    public static void main(String[] args){
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner in=new Scanner(System.in);
        int i,sum=0;
        do {
            i=in.nextInt();
            sum=sum+i;
        }while(i!=0);
        System.out.println("The sum of all integers is " +sum);
    }

}
