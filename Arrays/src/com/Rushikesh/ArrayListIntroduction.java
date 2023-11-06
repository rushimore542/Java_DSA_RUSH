package com.Rushikesh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListIntroduction {
    public static void main(String[] args){

        Scanner Scn=new Scanner(System.in);

        ArrayList<Integer> Numbers=new ArrayList();
        for(int i=0;i<5;i++)
        {
            Numbers.add(Scn.nextInt());

        }
        Collections.sort(Numbers);

        System.out.println(Numbers);
    }
}
