package com.Rushikesh;

public class FndUnique {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3,4,5};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr)
    {
        int unique1=0;
        for (int n:arr) {
        unique1^=n;
        }
        return unique1;
    }
}
