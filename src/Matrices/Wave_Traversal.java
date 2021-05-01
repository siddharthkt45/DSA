// Here, in this question, we're given an array
// and we have to print its elements by traversing it like a wave

package Matrices;

import java.util.Scanner;

public class Wave_Traversal {
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

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for (int i = n-1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
