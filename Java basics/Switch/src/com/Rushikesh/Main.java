package com.Rushikesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=input.nextInt();
        switch(i)
        {
            case 1:
                System.out.println("number is one");
                break;
            case 2:
                System.out.println("Number is Two");
                break;
            case 3:
                System.out.println("Number is three");
                break;
            default:
                System.out.println("Pls select number properly");
        }
    }
}
