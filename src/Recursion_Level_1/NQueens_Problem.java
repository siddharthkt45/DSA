// Here, in this question, we're given the length of a chess board and
// we've to place N (equal to length of chess board) Queens in the chess board
// in such a way that no Queen can attack any other Queen on the chess board.
// We've to print all such combinations.

package Recursion_Level_1;

import java.util.Scanner;

public class NQueens_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the chess board:- ");
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        System.out.println("The possible combinations are:- ");
        printNQueens(chess, "", 0);
    }

    private static void printNQueens(int[][] chess, String ans, int row) {
        if (row == chess.length) {      // Base case, when row becomes equal to chess.length
            System.out.println(ans);    // print the answer and
            return;                     // return
        }

        for (int col = 0; col < chess.length; col++) {  // iterate over chess.length for column
            if (isSafe(chess, row, col)) {      // check if the Queen is safe in this position
                chess[row][col] = 1;            // if yes, mark the square as 1
                // Make the call for row + 1 & append row + " - " + col + ", " to answer
                printNQueens(chess, ans + row + " - " + col + ", ", row + 1);
                chess[row][col] = 0;            // while returning, mark the square as 0
            }
        }
    }

    // function to check whether a given square is safe for the Queen or not
    private static boolean isSafe(int[][] chess, int row, int col) {
        // Check for threat in the column
        for (int i = row - 1; i >= 0; i--) {    // iterate from row - 1 to 0
            if (chess[i][col] == 1) {   // if there is already a Queen placed in the column
                return false;           // if yes, return false
            }
        }

        // Check for threat in the left diagonal
        // iterate i from row - 1 to 0 & j from col - 1 to 0
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {     // if there is already a Queen placed in the diagonal
                return false;           // return false
            }
        }

        // Check for threat in the right diagonal
        // iterate i from row - 1 to 0 & j from col + 1 to chess.length
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {     // if there is already a Queen placed in the diagonal
                return false;           // return false
            }
        }

        return true;    // return true if reached till here
    }
}