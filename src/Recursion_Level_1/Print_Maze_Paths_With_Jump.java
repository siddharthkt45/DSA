// Here, in this question, we're given two integers,
// resembling a row and a column respectively which resembles a maze and
// we've to print all the possible paths
// which take us to the end of the maze (last row and last column).
// We can move multiple steps at a time, the shortest being 1 & the biggest being length - 1,
// either in horizontal or in vertical direction or in diagonal direction.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Maze_Paths_With_Jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row length:- ");
        int n = sc.nextInt();
        System.out.println("Enter the column length:- ");
        int m = sc.nextInt();
        System.out.println("The maze paths possible are:- ");
        printMazePathsWithJump(1, 1, n, m, "");
    }

    private static void printMazePathsWithJump(int sr, int sc, int dr, int dc, String ans) {
        if (sr > dr || sc > dc) {       // Base case, when srow > drow or scol > dcol
            return;                     // return because no possible solution
        } else if (sr == dr && sc == dc) {  // else, when srow == drow && scol == dcol
            System.out.println(ans);        // print the answer and
            return;                         // return
        }

        // Horizontal paths
        for (int h = 1; h <= dc - sc; h++) {    // iterate over the diff of dest col & src col
            // Make the call to sc + h and add "h" + h to the answer
            printMazePathsWithJump(sr, sc + h, dr, dc, ans + "h" + h);
        }

        // Vertical paths
        for (int v = 1; v <= dr - sr; v++) {    // iterate over the diff of dest row & src row
            // Make the call to sr + v and add "v" + v to the answer
            printMazePathsWithJump(sr + v, sc, dr, dc, ans + "v" + v);
        }

        // Diagonal paths
        // iterate over the diff of dest row & src row && dest col & src col
        for (int d = 1; d <= dc - sc && d <= dr - sr; d++) {
            // Make the call to sr + d, sc + d and add "d" + d to the answer
            printMazePathsWithJump(sr + d, sc + d, dr, dc, ans + "d" + d);
        }
    }
}