package com.Rushikesh;

import java.util.Scanner;

public class MultiDimens_array {
    public static void main(String[] args) {
        int[][] array2D=new int[3][3];
        Scanner in=new Scanner(System.in);
        for (int row= 0; row < array2D.length; row++) {
            for (int col = 0; col< array2D[row].length ; col++) {
                array2D[row][col]=in.nextInt();
            }
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]);
            }
            System.out.println();
        }



    }
}
