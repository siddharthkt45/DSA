// In this question, we're given a 2-D sorted array and an element and
// we've to search for that element in the 2-D array by using something like binary search.

package Matrices;

import java.util.Scanner;

public class Search_In_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row count of this matrix:- ");
        int n = sc.nextInt();
        System.out.println("Enter the column count of this matrix:- ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element to be searched:- ");
        int x = sc.nextInt();

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (x == arr[i][j]) {           // if the element is found
                System.out.println(i + ", " + j);       // print the indices
                return;         // come out of the main function
            } else if (x < arr[i][j]) {     // if the element is smaller than the current position value
                j--;            // decrement j (move down in the column)
            } else {                        // if the element is greater than the current position value
                i++;            // increment i (move left in the row)
            }
        }

        System.out.println("Not found...");
    }
}
