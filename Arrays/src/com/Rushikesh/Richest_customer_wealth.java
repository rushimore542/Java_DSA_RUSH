package com.Rushikesh;

import java.util.Arrays;

public class Richest_customer_wealth {

    public static void main(String[] args) {
    int[][] accounts1= {{1,5},{7,3},{3,5}};
    int Maxwealth=maximumWealth(accounts1);
        System.out.println(Maxwealth);
    }
    static  int maximumWealth(int[][] accounts) {
        int[] sum1=new int[accounts.length];
        int sum=0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum=sum+accounts[i][j];

            }
            sum1[i]=sum;
            sum=0;
        }
        Arrays.sort(sum1);
        return sum1[sum1.length-1];
    }
}
