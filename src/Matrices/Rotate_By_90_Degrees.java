// Here, in this question, we're given an array,
// and we've to rotate the matrix by 90 degrees and print the new matrix.
// NOTE: We should NOT use any extra space...

package Matrices;

import java.util.Scanner;

public class Rotate_By_90_Degrees {
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

        // This approach doesn't use any extra space

        for (int i = 0; i < n; i++) {           // creating the transpose of a matrix
            for (int j = i; j < m; j++) {       // Here, we traverse only the upper triangular part
                int temp = arr[i][j];           // and then we swap the elements with its counterpart
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {       // We'll traverse the matrix row by row and swap column by column
            int a = 0;                  // Taking a variable at the starting column
            int b = m-1;                // Taking a variable at the last column
            while (a <= b) {            // Now, swapping the columns...
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }

        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

/*
        This approach uses extra space

        int[][] res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[j][n-1-i] = arr[i][j];
            }
        }

        for (int[] resArr : res) {
            for (int i : resArr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
*/
    }
}