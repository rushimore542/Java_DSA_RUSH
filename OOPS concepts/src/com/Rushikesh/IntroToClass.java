package com.Rushikesh;

import java.util.Scanner;

public class IntroToClass {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        Student rushikesh=new Student();
        rushikesh.greating();
//       rushikesh.rollno=12;
//       rushikesh.name="Rushikesh More";
//       rushikesh.marks=95.86;
//        System.out.println(rushikesh.marks);
    }

}
class Student
{
    int rollno;
    String name;
    double marks;
    void greating()
    {
        System.out.println("my name is "+name);
        System.out.println(marks);
        System.out.println(rollno);
    }

    Student()
    {
        this.rollno=15;
        this.name="Rushikesh More";
        this.marks=88;
    }
}
