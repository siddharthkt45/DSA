// Here, in this question, we're given two integers,
// resembling a row and a column respectively which resembles a maze and
// we've to return all the possible paths
// which take us to the end of the maze (last row and last column) in an arraylist.

package Recursion_Level_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Paths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row length:- ");
        int n = sc.nextInt();
        System.out.println("Enter column length:- ");
        int m = sc.nextInt();
        System.out.println("The maze paths possible are:- ");
        System.out.println(getMazePaths(0,0, n, m));
    }

    private static ArrayList<String> getMazePaths(int srow, int scol, int drow, int dcol) {
        if (srow < 0 || scol < 0 || srow == drow || scol == dcol) { // Base case, if you cross
            return new ArrayList<>();   // left/right/top/bottom boundary, return new arraylist
        } else if (srow == drow - 1 && scol == dcol - 1) {  // Base case, if you reach the last
            ArrayList<String> baseResult = new ArrayList<>();   // row & last column, create a
            baseResult.add("");     // new arraylist and add an empty string to the arraylist
            return baseResult;      // and return the arraylist
        }

        // Make the call to srow + 1, which means travelling in the horizontal direction & store
        ArrayList<String> row = getMazePaths(srow + 1, scol, drow, dcol);
        // Make the call to scol + 1, which means travelling in the vertical direction & store it
        ArrayList<String> col = getMazePaths(srow, scol + 1, drow, dcol);

        ArrayList<String> res = new ArrayList<>();  // create a new arraylist

        for (String i : row) {  // iterate over row arraylist
            res.add("h" + i);   // add "h" to each element
        }

        for (String i : col) {  // iterate over col arraylist
            res.add("v" + i);   // add "v" to each element
        }

        return res;     // return the resultant arraylist
    }
}