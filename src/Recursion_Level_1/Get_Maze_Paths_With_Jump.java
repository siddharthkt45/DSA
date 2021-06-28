// Here, in this question, we're given two integers,
// resembling a row and a column respectively which resembles a maze and
// we've to return all the possible paths
// which take us to the end of the maze (last row and last column) in an arraylist.
// We can move multiple steps at a time, the shortest being 1 & the biggest being length - 1,
// either in horizontal or in vertical direction or in diagonal direction.

package Recursion_Level_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Paths_With_Jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row length:- ");
        int n = sc.nextInt();
        System.out.println("Enter column length:- ");
        int m = sc.nextInt();
        System.out.println("The maze paths possible are:- ");
        System.out.println(getMazePathsWithJump(1, 1, n, m));
    }

    private static ArrayList<String> getMazePathsWithJump(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {         // Base case, when srow == drow and scol == dcol
            ArrayList<String> bres = new ArrayList<>(); // create a new arraylist
            bres.add("");                   // add an empty string to the arraylist
            return bres;                    // return the arraylist
        }

        ArrayList<String> paths = new ArrayList<>();    // create a new arraylist for result

        // Horizontal paths
        for (int h = 1; h <= dc - sc; h++) {    // iterate over the diff of dest col & src col
            // Make the call to sc + h and store in an arraylist
            ArrayList<String> hpaths = getMazePathsWithJump(sr, sc + h, dr, dc);

            for (String hpath : hpaths) {   // iterate over the arraylist and
                paths.add("h" + h + hpath); // add "h" + h to each element, i.e., the move no.
            }
        }

        // Vertical paths
        for (int v = 1; v <= dr - sr; v++) {    // iterate over the diff of dest row & src row
            // Make the call to sr + v and store in an arraylist
            ArrayList<String> vpaths = getMazePathsWithJump(sr + v, sc, dr, dc);

            for (String vpath : vpaths) {   // iterate over the arraylist and
                paths.add("v" + v + vpath); // add "v" + v to each element, i.e., the move no.
            }
        }

        // Diagonal paths
        // iterate over the diff of dest col & src col && dest row & src row
        for (int d = 1; d <= dc - sc && d <= dr - sr; d++) {
            // Make the call to sr + d, sc + d & store in an arraylist
            ArrayList<String> dpaths = getMazePathsWithJump(sr + d, sc + d, dr, dc);

            for (String dpath : dpaths) {   // iterate over the arraylist and
                paths.add("d" + d + dpath); // add "d" + d to each element, i.e., the move no.
            }
        }

        return paths;       // return the resultant arraylist
    }
}