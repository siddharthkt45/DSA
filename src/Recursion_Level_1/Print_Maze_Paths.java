// Here, in this question, we're given two integers,
// resembling a row and a column respectively which resembles a maze and
// we've to print all the possible paths
// which take us to the end of the maze (last row and last column).
// We can only move one step at a time, either in horizontal or in vertical direction.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Maze_Paths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row length:- ");
        int n = sc.nextInt();
        System.out.println("Enter column length:- ");
        int m = sc.nextInt();
        System.out.println("The maze paths possible are:- ");
        printMazePaths(1, 1, n, m, "");
    }

    private static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if (sr > dr || sc > dc) {   // Base case, when srow > drow or scol > dcol
            return;                 // return because no possible solution
        } else if (sr == dr && sc == dc) {  // else, when srow == drow && scol == dcol
            System.out.println(ans);        // print the answer and
            return;                         // return
        }

        // Make the call to sr + 1 & add "v" to the answer which means vertical move
        printMazePaths(sr + 1, sc, dr, dc, ans + "v");
        // Make the call to sc + 1 & add "h" to the answer which means horizontal move
        printMazePaths(sr, sc + 1, dr, dc, ans + "h");
    }
}