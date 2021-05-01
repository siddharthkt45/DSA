// This is the introduction to 2D arrays or Matrices
// In this problem, we'll take the input of a matrix and print it in that order

package Matrices;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:- ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:- ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {          // Number of rows are equal to the array length
            for (int j = 0; j < arr[i].length; j++) {   // Number of cols are equal to the array's element's length
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}