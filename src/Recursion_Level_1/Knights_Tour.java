// Here, in this question, we're given the length of chess board and
// the row & column position of the knight. We have to assign the move numbers
// on the squares of the chess board while visiting the squares.
// Once the knight has visited all the squares from the starting position, print the chess board.

package Recursion_Level_1;

import java.util.Scanner;

public class Knights_Tour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of chess board:- ");
        int n = sc.nextInt();
        System.out.println("Enter the row position of the knight:- ");
        int row = sc.nextInt();
        System.out.println("Enter the column position of the knight:- ");
        int col = sc.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess, row, col, 1);
    }

    private static void printKnightsTour(int[][] chess, int row, int col, int move) {
        if (row < 0 || col < 0 || row >= chess.length || col >= chess.length ||
            chess[row][col] > 0) {  // Base case, when you cross the left/top/right/bottom
            return;                 // boundary or visit already visited square, return
        } else if (move == chess.length * chess.length) {   // else, if you visit the last square
            chess[row][col] = move;         // mark the move number on the last square and
            displayBoard(chess);            // display the chess board
            chess[row][col] = 0;            // remove the marking from the square and
            return;                         // return
        }

        chess[row][col] = move;         // mark the move number on the square while visiting it
        // Make the calls for all the possible positions of the knight from the current position
        printKnightsTour(chess, row - 2, col + 1, move + 1);
        printKnightsTour(chess, row - 1, col + 2, move + 1);
        printKnightsTour(chess, row + 1, col + 2, move + 1);
        printKnightsTour(chess, row + 2, col + 1, move + 1);
        printKnightsTour(chess, row + 2, col - 1, move + 1);
        printKnightsTour(chess, row + 1, col - 2, move + 1);
        printKnightsTour(chess, row - 1, col - 2, move + 1);
        printKnightsTour(chess, row - 2, col - 1, move + 1);
        chess[row][col] = 0;            // remove the marking on the square while returning
    }

    private static void displayBoard(int[][] chess) {   // function to display the chess board
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");    // print the elements with a space
            }
            System.out.println();       // change the line
        }
        System.out.println();       // change the line after all the elements are printed
    }
}