// In this question, we're given a 2-D array and
// we've to traverse the upper triangular elements diagonal wise
// For example -    11 12
//                  21 22
// then the program should print the upper triangular elements while traversing them diagonally as -
// 11
// 22
// 12

package Matrices;

import java.util.Scanner;

public class Diagonal_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:- ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter the elements of array:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The upper triangular diagonal elements are:- ");
        for (int g = 0; g < arr.length; g++) {      // g stands for gap
            for (int i = 0, j = g; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}