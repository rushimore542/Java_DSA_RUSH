package com.Rushikesh;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

//        System.out.println(1);
//        System.out.println(2);
        /*
            for loop syntax:
            for(initialisation; condition,increment )
            {
                body
            }
         */
        //Print the numbers from 1 to 10
        System.out.println("for loop");
        for(int i=1;i<=10;i+=1){
            System.out.println("Number is " + i);
        }
        // print the number from 1 to n
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        for (int j = 1; j <=x; j++) {
            System.out.println("number wiil be " +j);
        }
        /*
            while syntax:
            initialisation
            while(condition)
            {
                body
                increment
            }
         */
        int k=1;
        System.out.println("while loop");
        while(k<=10){
            System.out.println(k);
            k+=3;
        }

        /*
            do while loop syntax:
            initialisation
            do
            {
                body
                increment
            }while(condition)
         */
        int l=1;
        System.out.println("Do while loop");
        do {
            System.out.println(l);
            l+=4;
        }while(l<=30);
    }
}
