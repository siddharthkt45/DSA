// Here, in this question, we're given a matrix which resembles a maze.
// In the maze, there are only 0's and 1's.
// 0 means keep moving in the same direction while 1 means turn 90 degrees to the right.
// We've to print the coordinates of the point from which the particle will come out.

package Matrices;

import java.util.Scanner;

public class End_Point_Of_A_Matrix {
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

        int dir = 0;    // e - 0, s - 1, w - 2, n - 3
        int i = 0;
        int j = 0;

        while (true) {
            dir = (dir + arr[i][j]) % 4;

            if (dir == 0) {     // east
                j++;
            } else if (dir == 1) {      // south
                i++;
            } else if (dir == 2) {      // west
                j--;
            } else if (dir == 3) {      // north
                i--;
            }

            if (i < 0) {        // if the particle comes out from the left wall
                i++;
                break;
            } else if (j < 0) {     // if the particle comes out from the top wall
                j++;
                break;
            } else if (i == arr.length) {       // if the particle comes out from the right wall
                i--;
                break;
            } else if (j == arr[0].length) {        // if the particle comes out from the bottom wall
                j--;
                break;
            }
        }

        System.out.print(i + ", " + j);
    }
}