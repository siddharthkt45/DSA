// Here, we're are given an array
// and we've to perform matrix multiplication on that array
// and print it in that order

package Matrices;

import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix:- ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of cols for the second matrix:- ");
        int c1 = sc.nextInt();

        int[][] m1 = new int[r1][c1];

        System.out.println("Enter the elements for the first matrix:- ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows for the second matrix:- ");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of cols for the second matrix:- ");
        int c2 = sc.nextInt();
        int[][] m2 = new int[r2][c2];

        System.out.println("Enter the elements for the second matrix:- ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        if (c1 != r2) {         // If the column size of first matrix and row size of second matrix do not match
            System.out.println("Invalid input!");       // print Invalid input as matrix can't be created for this
            return;                                     // set of values and return
        }

        int[][] res = new int[r1][c2];

        for (int i = 0; i < r1; i++) {      // Run a loop until the size of row1
            for (int j = 0; j < c2; j++) {      // Run a loop until the size of col2
                for (int k = 0; k < c1; k++) {      // Then run a loop until the size of col1
                    res[i][j] += (m1[i][k] * m2[k][j]);
                }
            }
        }

        for (int[] resArr : res) {          // print the matrix
            for (int i : resArr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}