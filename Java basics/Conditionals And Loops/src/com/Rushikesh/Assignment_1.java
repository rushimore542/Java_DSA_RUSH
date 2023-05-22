package com.Rushikesh;

import java.util.*;

public class Assignment_1 {
    public static void main(String[] args){
    // Area and perimeter of circle

        System.out.println("Enter the value of radius of circle");
        Scanner num=new Scanner(System.in);
        int radius=num.nextInt();
        final double pi=3.141;
        double area=pi*(radius*radius);
        double perimeter = 2*pi*radius;
        System.out.println("area of circle " +area + " Perimeter of circle " +perimeter);

    }
}
