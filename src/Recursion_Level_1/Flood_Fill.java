// Here, in this question, we're given a maze in the form of a 2D array
// with some obstacles in it. The obstacles are identified as 1s in the maze
// and the 0s indicate open space. We've to print all the possible paths which
// can take us to the end of the maze.

package Recursion_Level_1;

import java.util.Scanner;

public class Flood_Fill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row length:- ");
        int n = sc.nextInt();
        System.out.println("Enter the column length:- ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the maze:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        System.out.println("The possible paths for the maze are:- ");
        floodFill(arr, 0, 0, "", visited);
    }

    private static void floodFill(int[][] maze, int row, int col, String ans, boolean[][] visited) {
        // Base case, when row crosses the top or bottom boundary or when column crosses the
        // left or right boundary or when there is an obstacle or when the box is already visited
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length ||
            maze[row][col] == 1 || visited[row][col]) {
            return;                         // return
        } else if (row == maze.length - 1 && col == maze[0].length - 1) {
            // else when row & col reach the last box of the maze
            System.out.println(ans);    // print the answer and
            return;                     // return
        }

        visited[row][col] = true;                       // mark the current box as visited
        floodFill(maze, row - 1, col, ans + "t", visited);  // Make the call for row - 1
        floodFill(maze, row, col - 1, ans + "l", visited);  // Make the call for col - 1
        floodFill(maze, row + 1, col, ans + "d", visited);  // Make the call for row + 1
        floodFill(maze, row, col + 1, ans + "r", visited);  // Make the call for col + 1
        visited[row][col] = false;                      // Mark the current box as not visited
    }
}