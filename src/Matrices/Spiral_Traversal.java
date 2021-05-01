// Here, in this question, we're given an array
// and we've to print its elements by traversing it in spiral order

package Matrices;

import java.util.Scanner;

public class Spiral_Traversal {
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

        int minr = 0;       // indicates the minimum row
        int minc = 0;       // indicates the minimum column
        int maxr = n-1;     // indicates the maximum row
        int maxc = m-1;     // indicates the maximum column

        int totElements = n * m;        // indicates the total number of elements
        int count = 0;              // counter used to determine how many time to run the outer loop

        while (count < totElements) {       // while count is less than totElements
            // left wall
            for (int i = minr, j = minc; i <= maxr && count < totElements; i++) {
                System.out.println(arr[i][j]);
                count++;    // increment the count after printing each element
            }
            minc++;         // after printing the left wall, move the minimum column one step forward

            // bottom wall
            for (int i = maxr, j = minc; j <= maxc && count < totElements; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;         // after printing the bottom wall, move the maximum row one step upwards

            // right wall
            for (int i = maxr, j = maxc; i >= minr && count < totElements; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;         // after printing the right wall, move the maximum column one step backwards

            // top wall
            for (int i = minr, j = maxc; j >= minc && count < totElements; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;         // after printing the top wall, move the minimum row one step downwards
        }
    }
}