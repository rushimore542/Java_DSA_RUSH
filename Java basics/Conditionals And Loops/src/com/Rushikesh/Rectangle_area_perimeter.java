package com.Rushikesh;

import java.util.Scanner;

public class Rectangle_area_perimeter {
    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        System.out.println("Enter length and width of rectangle");
        int length= take.nextInt();
        int width= take.nextInt();
        int area=length* width;
        System.out.println("Area of rectangle " +area);
        int perim=2*(length+width);
        System.out.println("Perimter of rectangle " +perim);
    }
}
