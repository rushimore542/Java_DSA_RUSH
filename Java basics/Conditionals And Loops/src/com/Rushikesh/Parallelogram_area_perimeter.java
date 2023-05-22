package com.Rushikesh;

import java.util.Scanner;

public class Parallelogram_area_perimeter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the base and height");
        int base= input.nextInt();
        int height=input.nextInt();
        int side=input.nextInt();
        int area=base*height;
        System.out.println("Area of parallelogram is " +area);
        int perimeter =2 * (side+base);
        System.out.println("Perimeter of parallelogram is " + perimeter );
    }
}
