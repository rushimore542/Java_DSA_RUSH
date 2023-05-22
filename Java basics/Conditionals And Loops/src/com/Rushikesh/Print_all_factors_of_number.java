package com.Rushikesh;

import java.util.Scanner;

public class Print_all_factors_of_number {
    public static void main(String[] args){
        //Input a number and print all the factors of that number (use loops).
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        System.out.print("The factors of "+number +" is : ");
        for (int i = 1; i <=number; i++) {
            if (number%i==0){
                System.out.print(i +" ");
            }


        }

    }
}
