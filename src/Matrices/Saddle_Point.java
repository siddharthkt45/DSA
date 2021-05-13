// In this question, we're given a 2-D array and
// we've to calculate the saddle point of the matrix.
// There can be at most 1 saddle point in any matrix.
// A saddle point of the matrix is the element
// which is the smallest in its row but the greatest in its column.

package Matrices;

import java.util.Scanner;

public class Saddle_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix:- ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter the elements of the matrix:- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int svj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }

            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][svj] > arr[i][svj]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(arr[i][svj]);
                return;
            }
        }

        System.out.println("Invalid input");
    }
}