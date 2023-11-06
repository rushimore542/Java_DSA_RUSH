package com.Rushikesh;

public class Stringifier {
    public static void main(String[] args)
    {
        StringBuilder bdr=new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch=(char)('a'+i);
            bdr.append(ch);
        }
        System.out.println(bdr.toString());
    }
}
