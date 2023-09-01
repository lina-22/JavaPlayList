package TrirdAppliArray71To86;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A= new int[2][3];
        int [][] B= new int[2][3];

        //getting input for a matrix
        System.out.println("Enter Elements for A matrix");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.printf("A[%d][%d] =",row, col);
               A[row][col]=input.nextInt();
            }
        }
        System.out.println("Enter Elements for B matrix");
        //getting input for B matrix

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.printf("A[%d][%d] =",row, col);
                B[row][col]=input.nextInt();
            }
        }

        //printing input for a matrix
        System.out.print("A =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.print(" \t" +A[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //printing input for B matrix
        System.out.print("B =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.print(" \t" +B[row][col]);
            }
            System.out.println();
        }
    }
}
